using System.Collections.Generic;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

[ApiController]
[Route("api/orders")]
public class OrderController : ControllerBase
{
    private readonly IOrderRepository _orderRepository;
    private readonly ILogger<OrderController> _logger;

    public OrderController(IOrderRepository orderRepository, ILogger<OrderController> logger)
    {
        _orderRepository = orderRepository;
        _logger = logger;
    }

    [HttpGet("{orderId}")]
    public async Task<IActionResult> GetOrder(int orderId)
    {
        if (orderId <= 0)
        {
            _logger.LogWarning("Invalid Order ID received");
            return BadRequest("Invalid Order ID.");
        }

        var order = await _orderRepository.GetOrderAsync(orderId);
        return order != null ? Ok(order) : NotFound("Order not found.");
    }

    [HttpGet]
    public async Task<IActionResult> GetAllOrders()
    {
        var orders = await _orderRepository.GetAllOrdersAsync();
        return Ok(orders);
    }

    [HttpPost]
    public async Task<IActionResult> CreateOrder([FromBody] Order order)
    {
        if (string.IsNullOrWhiteSpace(order.Product) || order.Quantity <= 0)
        {
            _logger.LogWarning("Invalid order input received.");
            return BadRequest("Invalid order details.");
        }

        var result = await _orderRepository.CreateOrderAsync(order);
        return result ? Ok("Order Created") : StatusCode(500, "Error creating order.");
    }

    [HttpDelete("{orderId}")]
    public async Task<IActionResult> DeleteOrder(int orderId)
    {
        if (orderId <= 0)
        {
            _logger.LogWarning("Invalid Order ID for deletion.");
            return BadRequest("Invalid Order ID.");
        }

        var result = await _orderRepository.DeleteOrderAsync(orderId);
        return result ? Ok("Order Deleted") : NotFound("Order not found.");
    }
}
