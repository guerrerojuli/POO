package taller04;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private Integer areaCode, prefix, lineNumber;

    @Override
    public int compareTo(PhoneNumber number) {
        int areaCodeCmp = areaCode.compareTo(number.areaCode);
        if (areaCodeCmp != 0) return areaCodeCmp;
        int prefixCmp = prefix.compareTo(number.prefix);
        if (prefixCmp != 0) return prefixCmp;
        return lineNumber.compareTo(number.lineNumber);
    }
}
