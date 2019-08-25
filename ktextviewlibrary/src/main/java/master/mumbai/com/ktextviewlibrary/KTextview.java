package master.mumbai.com.ktextviewlibrary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;

public class KTextview extends android.support.v7.widget.AppCompatTextView {

    private static final char[] SUFFIXES = {'k', 'm', 'g', 't', 'p', 'e'};

    public KTextview(Context context) {
        super(context);
    }

    public KTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void setFormattedValue(Long number) {
        //get converted long value in string
        String returnValueFormatted = convert(number);
        this.setText(returnValueFormatted);
    }

    //Formatting logic
    @NonNull
    public static String convert(long number) {
        try {
            if (number < 1000) {
                // No need to format this
                return String.valueOf(number);
            }
            // Convert to a string
            final String string = String.valueOf(number);
            // The suffix we're using, 1-based
            final int magnitude = (string.length() - 1) / 3;
            // The number of digits we must show before the prefix
            final int digits = (string.length() - 1) % 3 + 1;

            // Build the string
            char[] value = new char[4];
            for (int i = 0; i < digits; i++) {
                value[i] = string.charAt(i);
            }
            int valueLength = digits;
            // Can and should we add a decimal point and an additional number?
            if (digits == 1 && string.charAt(1) != '0') {
                value[valueLength++] = '.';
                value[valueLength++] = string.charAt(1);
            }
            value[valueLength++] = SUFFIXES[magnitude - 1];
            return new String(value, 0, valueLength);

        } catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }
}
