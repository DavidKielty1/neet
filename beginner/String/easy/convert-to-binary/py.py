def convert_date_to_binary(date: str) -> str:
    """
    Convert a date string to its binary representation.
    Example: "2080-02-29" -> "100000100000-10-11101"
    
    How it works:
    1. Split "2080-02-29" into ["2080", "02", "29"]
    2. Convert each number to binary:
       - 2080 -> "100000100000" (remove "0b" prefix using [2:])
       - 02 -> "10"
       - 29 -> "11101"
    3. Join back with hyphens
    """
    # Split the date into year, month, day
    year, month, day = date.split('-')
    
    # Convert each part to binary, removing the '0b' prefix
    binary_year = bin(int(year))[2:]    # e.g., '2080' -> '100000100000'
    binary_month = bin(int(month))[2:]   # e.g., '02' -> '10'
    binary_day = bin(int(day))[2:]      # e.g., '29' -> '11101'
    
    # Join with hyphens and return
    return f"{binary_year}-{binary_month}-{binary_day}"


# Test cases
print(convert_date_to_binary("2080-02-29"))  # "100000100000-10-11101"
print(convert_date_to_binary("1900-01-01"))  # "11101101100-1-1"