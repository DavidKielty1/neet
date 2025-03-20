public class Solution {
    public string DefangIPaddr(string address) {
        return address.Replace(".", "[.]");
    }

    public string DefangIPaddr2(string address) {
        return string.Join("[.]", address.Split('.'));
    }
}

var solution = new Solution();
Console.WriteLine(solution.DefangIPaddr("1.1.1.1")); 