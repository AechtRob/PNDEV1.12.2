package net.lepidodendron.entity.model.llibraryextensions;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class AdvancedModelBaseExtended extends AdvancedModelBase {
    private float movementScale = 1.0F;

    /**
     * Moves this box up and down (rotationPointY). Useful for bodies.
     *
     * @param box    the box to animate
     * @param speed  is how fast the animation runs;
     * @param degree is how far the box will move;
     * @param bounce will make the box bounce;
     * @param offset      will offset the timing of the animation
     * @param f      is the walked distance;
     * @param f1     is the walk speed.
     */
    public void bobExtended(AdvancedModelRendererExtended box, float speed, float degree, boolean bounce, float offset, float f, float f1) {
        box.bobExtended(speed, degree, bounce, offset, f, f1);
    }

    /**
     * Returns a float that can be used to move boxes.
     *
     * @param speed  is how fast the animation runs;
     * @param degree is how far the box will move;
     * @param bounce will make the box bounce;
     * @param offset      will offset the timing of the animation
     * @param f      is the walked distance;
     * @param f1     is the walk speed.
     */
    public float moveBoxExtended(float speed, float degree, boolean bounce, float offset, float f, float f1) {
        if (bounce) {
            return -MathHelper.abs((MathHelper.sin(f * speed + offset) * f1 * degree));
        } else {
            return MathHelper.sin(f * speed + offset) * f1 * degree - f1 * degree;
        }
    }


    /**
     * Swings (rotates on the Y axis) the given model parts in a chain-like manner.
     *
     * @param boxes       the boxes to swing
     * @param speed       the speed to swing this at
     * @param degree      the amount to rotate this by
     * @param rootOffset  the root rotation offset
     * @param offsetTime      will offset the timing of the animation
     * @param swing       the swing rotation
     * @param swingAmount the swing amount
     */
    public void chainSwingExtended(AdvancedModelRenderer[] boxes, float speed, float degree, double rootOffset, float offsetTime, float swing, float swingAmount) {
        float offset = this.calculateChainOffset(rootOffset, boxes);
        for (int index = 0; index < boxes.length; index++) {
            boxes[index].rotateAngleY += this.calculateChainRotationExtended(speed, degree, swing, swingAmount, offset, offsetTime, index);
        }
    }

    /**
     * Waves (rotates on the X axis) the given model parts in a chain-like manner.
     *
     * @param boxes       the boxes to wave
     * @param speed       the speed to wave this at
     * @param degree      the amount to rotate this by
     * @param rootOffset  the root rotation offset
     * @param offsetTime      will offset the timing of the animation
     * @param swing       the swing rotation
     * @param swingAmount the swing amount
     */
    public void chainWaveExtended(AdvancedModelRenderer[] boxes, float speed, float degree, double rootOffset, float offsetTime, float swing, float swingAmount) {
        float offset = this.calculateChainOffset(rootOffset, boxes);
        for (int index = 0; index < boxes.length; index++) {
            boxes[index].rotateAngleX += this.calculateChainRotationExtended(speed, degree, swing, swingAmount, offset, offsetTime, index);
        }
    }

    /**
     * Flaps (rotates on the Z axis) the given model parts in a chain-like manner.
     *
     * @param boxes       the boxes to flap
     * @param speed       the speed to flap this at
     * @param degree      the amount to rotate this by
     * @param rootOffset  the root rotation offset
     * @param offsetTime      will offset the timing of the animation
     * @param swing       the swing rotation
     * @param swingAmount the swing amount
     */
    public void chainFlapExtended(AdvancedModelRenderer[] boxes, float speed, float degree, double rootOffset, float offsetTime, float swing, float swingAmount) {
        float offset = this.calculateChainOffset(rootOffset, boxes);
        for (int index = 0; index < boxes.length; index++) {
            boxes[index].rotateAngleZ += this.calculateChainRotationExtended(speed, degree, swing, swingAmount, offset, offsetTime, index);
        }
    }

    private float calculateChainRotationExtended(float speed, float degree, float swing, float swingAmount, float offset, float offsetTime, int boxIndex) {
        return MathHelper.cos(swing * (speed * this.movementScale) + offset * boxIndex + offsetTime) * swingAmount * (degree * this.movementScale);
    }

    private float calculateChainOffset(double rootOffset, AdvancedModelRenderer... boxes) {
        return (float) ((rootOffset * Math.PI) / (2 * boxes.length));
    }

}
