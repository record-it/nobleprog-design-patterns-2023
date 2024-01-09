package builder.filter;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Data
@Builder
public class StringFilter {
    private int minLength;
    private int maxLength;
    private String startsWith;
    private String endsWith;
    private String contains;

    public  Predicate<String> buildPredicate(){
        Predicate<String> predicate = this::minLength;
        predicate = predicate.and(this::maxLength);
        if(Objects.nonNull(startsWith)){
            predicate = predicate.and(a -> a.startsWith(startsWith));
        }
        if(Objects.nonNull(endsWith)){
            predicate = predicate.and(a -> a.endsWith(endsWith));
        }
        if(Objects.nonNull(contains)){
            predicate = predicate.and(a -> a.contains(contains));
        }
        return predicate;
    }

    private boolean minLength(String a){
        return a.length() >= minLength;
    }
    private boolean maxLength(String a){
        return a.length() <= minLength;
    }
}
