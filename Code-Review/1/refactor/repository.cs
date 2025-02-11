using System.Collections.Generic;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Logging;

public interface IOrderRepository
{
    Task<Order?> GetOrderAsync(int orderId);
    Task<List<Order>> GetAllOrdersAsync();
    Task<bool> CreateOrderAsync(Order order);
    Task<bool> DeleteOrderAsync(int orderId);
}

public class OrderRepository : IOrderRepository
{
    private readonly AppDbContext _context;
    private readonly ILogger<OrderRepository> _logger;

    public OrderRepository(AppDbContext context, ILogger<OrderRepository> logger)
    {
        _context = context;
        _logger = logger;
    }

    public async Task<Order?> GetOrderAsync(int orderId)
    {
        return await _context.Orders.FindAsync(orderId);
    }

    public async Task<List<Order>> GetAllOrdersAsync()
    {
        return await _context.Orders.ToListAsync();
    }

    public async Task<bool> CreateOrderAsync(Order order)
    {
        try
        {
            await _context.Orders.AddAsync(order);
            await _context.SaveChangesAsync();
            return true;
        }
        catch (System.Exception ex)
        {
            _logger.LogError($"Error creating order: {ex.Message}");
            return false;
        }
    }

    public async Task<bool> DeleteOrderAsync(int orderId)
    {
        var order = await _context.Orders.FindAsync(orderId);
        if (order == null) return false;

        _context.Orders.Remove(order);
        await _context.SaveChangesAsync();
        return true;
    }
}