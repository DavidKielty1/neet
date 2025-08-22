def interpret(command: str) -> str:
    """
    Interpret a string command where:
    - "G" remains "G"
    - "()" becomes "o"
    - "(al)" becomes "al"
    
    Example: "G()(al)" -> "Goal"
    
    How it works:
    1. Replace "(al)" with "al" first (longer pattern)
    2. Then replace "()" with "o" (shorter pattern)
    3. "G" stays as is
    
    Order matters! If we did shorter pattern first:
    "G()(al)" would become "Go(al)" -> wrong!
    """
    # Simple replacements in order of longest to shortest
    return command.replace("(al)", "al").replace("()", "o")


# Test cases
print(interpret("G()(al)"))           # "Goal"
print(interpret("G()()()()(al)"))     # "Gooooal"
print(interpret("(al)G(al)()()G"))    # "alGalooG"