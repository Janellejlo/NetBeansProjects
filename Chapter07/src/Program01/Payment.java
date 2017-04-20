/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program01;

/**
 *
 * @author janellejlo
 */
public class Payment {
    
    private double getPlace(String number) {
        switch (number.length()) {
        
        case 1:
            return DefinePlace.UNITS;
        case 2:
            return DefinePlace.TENS;
        case 3:
            return DefinePlace.HUNDREDS;
        case 4:
            return DefinePlace.THOUSANDS;
        case 5:
            return DefinePlace.TENTHOUSANDS;
        case 6:
            return DefinePlace.LAKHS;
        case 7:
            return DefinePlace.TENLAKHS;
        case 8:
            return DefinePlace.CRORES;
        case 9:
            return DefinePlace.TENCRORES;
        }
        return 0.0;
}// getPlace

    private String getWord(int number) {
        switch (number) {
       
            case 1:
                return "One";
        
            case 2:
                return "Two";
        
            case 3:
                return "Three";
        
            case 4:
                return "Four";
        
            case 5:
                return "Five";
        
            case 6:
                return "Six";
        
            case 7:
                return "Seven";
        
            case 8:
                return "Eight";
        
            case 9:
                return "Nine";
        
            case 0:
                return "Zero";
        
            case 10:
                return "Ten";
        
            case 11:
                return "Eleven";
        
            case 12:
                return "Tweleve";
        
            case 13:
                return "Thirteen";
        
            case 14:
                return "Forteen";
        
            case 15:
                return "Fifteen";
       
            case 16:
                return "Sixteen";
        
            case 17:
                return "Seventeen";
        
            case 18:
                return "Eighteen";
        
            case 19:
                return "Ninteen";
        
            case 20:
                return "Twenty";
        
            case 30:
                return "Thirty";
        
            case 40:
                return "Forty";
        
            case 50:
                return "Fifty";
        
            case 60:
                return "Sixty";
        
            case 70:
                return "Seventy";
        
            case 80:
                return "Eighty";
        
            case 90:
                return "Ninty";
        
            case 100:
                return "Hundred";
        } // switch
        return "";
        
    } // getWord

    private String cleanNumber(String number) {
        
        String cleanedNumber = "";

        cleanedNumber = number.replace('.', ' ').replaceAll(" ", "");
        cleanedNumber = cleanedNumber.replace(',', ' ').replaceAll(" ", "");
        
            if (cleanedNumber.startsWith("0"))
                cleanedNumber = cleanedNumber.replaceFirst("0", "");

        return cleanedNumber;
    } // cleanNumber

    public String convertNumber(String number) {
        //number = cleanNumber(number);
        double num = 0.0;
        try {
            num = Double.parseDouble(number);
        } 
        catch (Exception e) {
        return "Invalid Number Sent to Convert";
        } // catch

        String returnValue = "";
        
        while (num > 0) {
            number = "" + (int) num;
            double place = getPlace(number);
            
            if (place == DefinePlace.TENS || place == DefinePlace.TENTHOUSANDS
                || place == DefinePlace.TENLAKHS
                || place == DefinePlace.TENCRORES) {
                int subNum = Integer.parseInt(number.charAt(0) + ""
                + number.charAt(1));

        if (subNum >= 21 && (subNum % 10) != 0) {
            returnValue += getWord(Integer.parseInt(""
            + number.charAt(0)) * 10)
            + " " + getWord(subNum % 10);
        } // if
        
        else {
            returnValue += getWord(subNum);
        }// else

        if (place == DefinePlace.TENS) {
            num = 0;
        }// if
        
        else if (place == DefinePlace.TENTHOUSANDS) {
            num -= subNum * DefinePlace.THOUSANDS;
            returnValue += " Thousands ";
        }// if
        
        else if (place == DefinePlace.TENLAKHS) {
            num -= subNum * DefinePlace.LAKHS;
            returnValue += " Lakhs ";
        }// if
        
        else if (place == DefinePlace.TENCRORES) {
            num -= subNum * DefinePlace.CRORES;
            returnValue += " Crores ";
        }// if
        
        }// if
            else {
                int subNum = Integer.parseInt("" + number.charAt(0));

                returnValue += getWord(subNum);
                    if (place == DefinePlace.UNITS) {
                    num = 0;
                }

                    else if (place == DefinePlace.HUNDREDS) {
                num -= subNum * DefinePlace.HUNDREDS;
                returnValue += " Hundred ";
                }

                    else if (place == DefinePlace.THOUSANDS) {
                num -= subNum * DefinePlace.THOUSANDS;
                returnValue += " Thousand ";
                }

                    else if (place == DefinePlace.LAKHS) {
                num -= subNum * DefinePlace.LAKHS;
                returnValue += " Lakh ";
                }

                    else if (place == DefinePlace.CRORES) {
                num -= subNum * DefinePlace.CRORES;
                returnValue += " Crore ";
                }
                }
            }
            return returnValue;
        }// convert number

    protected static double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Payment(double amount) {
        super();
        this.amount = amount;
    }


    public String paymentDetails(double amount) {
        return convertNumber(String.valueOf(amount));
    }
}

class DefinePlace {
    public static final double UNITS = 1;
    public static final double TENS = 10 * UNITS;
    public static final double HUNDREDS = 10 * TENS;
    public static final double THOUSANDS = 10 * HUNDREDS;
    public static final double TENTHOUSANDS = 10 * THOUSANDS;
    public static final double LAKHS = 10 * TENTHOUSANDS;
    public static final double TENLAKHS = 10 * LAKHS;
    public static final double CRORES = 10 * TENLAKHS;
    public static final double TENCRORES = 10 * CRORES;
}