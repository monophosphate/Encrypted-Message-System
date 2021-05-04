/**
 * Basic object to hold phone numbers. It can be assumed phone numbers are 10 digits
 *
 *
 * @author Alex Babou <br>
 *         ababou@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class PhoneNumber {
    private String type;
    private String number;

    /**
     * The type of phone number - mobile, home, office, other
     *  the type associated with the number
     */
    public String getType() {
        return type;
    }

    /**
     * sets the type of phone number
     * @param type string to set it to
     */
    public void setType(String type) {
        this.type = type;
    }

    /** Gets the phone number as *rawnumbers* only **/
    public String getNumber() {
        return number;
    }

    /** Sets the phone number. I thousl be set as raw numbers 5554443333 for example, NOT (555)444-3333 **/
    public void setNumber(String number) {
        this.number = number;
    }

    /** Gets the first 3 digits, you can assume US Standard, so 10 digits **/
    public String getAreaCode() {
        return number.substring(0, 3);
    }

    /** Gets the second three digits. In the number (555) 444-3333, 4444 would be the prefis. Remember, phone
     * numbers are stored as number strings only, so 5554443333.
     *  the prefix
     */
    public String getPrefix() {
        return number.substring(3, 6);
    }

    /** get the last four digits in a number (so location 6 onward) **/
    public String getLine() {
        return number.substring(6);
    }

    /**
     * Reformats a 10 digit only number, into US Standard display format, so 5554443333 becomes (555) 444-3333
     *  a US Standard formatted number
     */
    public String getPrettyNumber() {
        return "(" + getAreaCode() + ") " + getPrefix() + "-" + getLine();
    }

    /**
     * Returns a string of format type: prettyNumber   - the type is 7 padded (%-7s)
     *
     */
    public String render() {
        return String.format("%-8s", getType() + ":") + getPrettyNumber();
    }

    /**
     * Basic constructor
     * @param type the type of number
     * @param number the phone number as a ten digit string
     */
    public PhoneNumber(String type, String number) {
        setType(type);
        setNumber(number);
    }

}
