package net.insomniakitten.pylon.ref;

import net.insomniakitten.pylon.annotation.rift.Listener;
import net.insomniakitten.pylon.annotation.rift.Mod;

import javax.annotation.Nonnull;
import java.util.Locale;

// TODO Move into Rift's API to reduce potential code duplication

/**
 * Constants that represent that physical sides of the game runtime
 * Utilized for loading conditions of {@link Mod} and {@link Listener}
 * @author InsomniaKitten
 * @since 0.1.0
 */
public enum Side {
    /**
     * Represents an ambiguity of both sides
     */
    EITHER,

    /**
     * Represents the physical client side
     */
    CLIENT,

    /**
     * Represents the physical server side
     */
    SERVER;

    /**
     * Determines if this Side represents either physical side
     * @return True if {@link Side#EITHER} equals this Side
     * @since 0.1.0
     */
    @Deprecated // use Side#isAmbiguous
    public final boolean isEither() {
        return Side.EITHER == this;
    }

    /**
     * Determines if this Side represents either physical side
     * @return True if {@link Side#EITHER} equals this Side
     * @since 0.3.2
     */
    public final boolean isAmbiguous() {
        return Side.EITHER == this;
    }

    /**
     * Determines if this Side represents the physical client side
     * @return True if {@link Side#CLIENT} equals this Side
     * @since 0.1.0
     */
    public final boolean isClient() {
        return Side.CLIENT == this;
    }

    /**
     * Determines if this Side represents the physical server side
     * @return True if {@link Side#SERVER} equals this Side
     * @since 0.1.0
     */
    public final boolean isServer() {
        return Side.SERVER == this;
    }

    /**
     * Determines if this Side is equivalent to the given {@code side}
     * @return True if {@link Side#EITHER} or {@code side} equals this Side
     * @since 0.1.0
     */
    public final boolean isEquivalentTo(final Side side) {
        return Side.EITHER == this || side == this;
    }

    /**
     * A user friendly name for this Side, formed by the lower-cased
     * value of the constant's field name.
     * @since 0.1.0
     */
    @Nonnull
    public final String getName() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
