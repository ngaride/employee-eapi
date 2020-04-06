package com.adp;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class Myutil 
{
     public static String camelCaseConversion(String inputString) 
    {
        if (StringUtils.isBlank(inputString)) {
            return "";
        }
 
        if (StringUtils.length(inputString) == 1) {
            return inputString.toUpperCase();
        }
 
        StringBuffer resultPlaceHolder = new StringBuffer(inputString.length());
 
        Stream.of(inputString.split(" ")).forEach(stringPart -> 
        {
            if (stringPart.length() > 1)
                resultPlaceHolder.append(stringPart.substring(0, 1)
                                    .toUpperCase())
                                    .append(stringPart.substring(1)
                                    .toLowerCase());
            else
                resultPlaceHolder.append(stringPart.toUpperCase());
 
            resultPlaceHolder.append(" ");
        });
        return StringUtils.trim(resultPlaceHolder.toString());
    }
}
