package builder.options;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PasswordOptions {
    @Builder.Default
    private boolean hasDigit = true;
    @Builder.Default
    private boolean hasSpecialChar = false;
    @Builder.Default
    private boolean hasUpperCase = true;
    @Builder.Default
    private int minLength = 6;
    @Builder.Default
    private int maxLength = 8;
}
