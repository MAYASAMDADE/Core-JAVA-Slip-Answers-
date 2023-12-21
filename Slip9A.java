/*class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class Slip9A {
    public static void main(String[] args) {
        try {
            String panNumber = "ABCDE1234F"; // Replace with the PAN number you want to validate
            String mobileNumber = "1234567890"; // Replace with the mobile number you want to validate

            validatePanNumber(panNumber);
            validateMobileNumber(mobileNumber);

            System.out.println("PAN Number: " + panNumber);
            System.out.println("Mobile Number: " + mobileNumber);
        } catch (InvalidDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // PAN Number Validation
    static void validatePanNumber(String pan) throws InvalidDataException {
        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            // Valid PAN Number
        } else {
            throw new InvalidDataException("Invalid PAN Number");
        }
    }

    // Mobile Number Validation
    static void validateMobileNumber(String mobile) throws InvalidDataException {
        if (mobile.matches("[0-9]{10}")) {
            // Valid Mobile Number
        } else {
            throw new InvalidDataException("Invalid Mobile Number");
        }
    }
}*/











class PanException extends Exception
{
	PanException()
	{
		System.out.println("length of pan number is invalid ");
	}
}

class MobileException extends Exception
{
	
	MobileException()
	{
		System.out.println("error in mobile no ");
	}
}	

public class Slip9A
{
	public static void main(String arg[])
	{
		try
		{
			int f=0;
			String pno=arg[0];	
			String mno=arg[1];
			if(pno.length()!=10)
			{
				throw new PanException();
			}
			
			if(mno.length()==10)
			{
				f=1;
			}
			for(int i=0;i<mno.length();i++)
			{
				if(mno.charAt(i)>='0' && mno.charAt(i)<='9')
				{
					f=1;
				}
				else
				{
					f=0;
					break;
				}
			}
			if(f==0)
			{
				throw new MobileException();
			}
		}
		catch(MobileException me)
		{
			System.out.println("error in mobile number ");
		}

		catch(PanException pe)
		{
			System.out.println("error in PAN number ");
		}
	}
}


