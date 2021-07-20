package io.github.reperakpro.nocap;

import lombok.Getter;
import lombok.Setter;

public class NoCap {
    private static @Getter @Setter int maxEnchantmentLevel = Short.MAX_VALUE;
}
