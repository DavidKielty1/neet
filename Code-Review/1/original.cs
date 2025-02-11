using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using Microsoft.AspNetCore.Mvc;

namespace BadApi.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class UserController : ControllerBase
    {
        [HttpGet("{id}")]
        public IActionResult GetUser(int id)
        {
            var connString = "Server=myserver;Database=mydb;User Id=myuser;Password=mypassword;";
            using (SqlConnection conn = new SqlConnection(connString))
            {
                conn.Open();
                string sql = "SELECT * FROM Users WHERE Id = " + id;
                SqlCommand cmd = new SqlCommand(sql, conn);
                SqlDataReader reader = cmd.ExecuteReader();

                if (reader.Read())
                {
                    return Ok(new
                    {
                        Id = reader["Id"],
                        Name = reader["Name"],
                        Email = reader["Email"]
                    });
                }
                return NotFound("User not found.");
            }
        }

        [HttpPost]
        public IActionResult CreateUser(string name, string email)
        {
            var connString = "Server=myserver;Database=mydb;User Id=myuser;Password=mypassword;";
            using (SqlConnection conn = new SqlConnection(connString))
            {
                conn.Open();
                string sql = $"INSERT INTO Users (Name, Email) VALUES ('{name}', '{email}')";
                SqlCommand cmd = new SqlCommand(sql, conn);
                cmd.ExecuteNonQuery();
            }

            return Ok("User created.");
        }
    }
}
