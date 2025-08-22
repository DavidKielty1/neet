const defang = (ip: string): string => {
    return ip.replaceAll('.', '[.]');
    
    // Alternative approaches:
    // return ip.split('.').join('[.]');
    // return ip.replace(/\./g, '[.]');
}

// Test cases
console.log(defang("1.1.1.1"));         // "1[.]1[.]1[.]1"
console.log(defang("255.100.50.0"));    // "255[.]100[.]50[.]0"