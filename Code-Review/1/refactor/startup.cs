public void ConfigureServices(IServiceCollection services)
{
    services.AddControllers();
    services.AddDbContext<AppDbContext>(options =>
        options.UseSqlServer(Configuration.GetConnectionString("DefaultConnection")));
    services.AddScoped<IOrderRepository, OrderRepository>();
}
