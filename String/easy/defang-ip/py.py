def defang_ip_address(address: str) -> str:
    """
    Replace every period "." in an IP address with "[.]"
    Example: "1.1.1.1" -> "1[.]1[.]1[.]1"
    
    How it works:
    - Using string replace() method to substitute all "." with "[.]"
    - Simple one-liner solution is most readable here
    - No need for loops or complex logic
    """
    return address.replace('.', '[.]')


# Test cases
print(defang_ip_address("1.1.1.1"))         # "1[.]1[.]1[.]1"
print(defang_ip_address("255.100.50.0"))    # "255[.]100[.]50[.]0"