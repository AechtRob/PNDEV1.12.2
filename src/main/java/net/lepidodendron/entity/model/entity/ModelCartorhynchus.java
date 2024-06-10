package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCartorhynchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelCartorhynchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended rostrum1;
    private final AdvancedModelRendererExtended rostrum2;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended lowerrostrum1;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended gums;
    private final AdvancedModelRendererExtended FrontFlipperR;
    private final AdvancedModelRendererExtended flipper3;
    private final AdvancedModelRendererExtended flipper4;
    private final AdvancedModelRendererExtended flipper5;
    private final AdvancedModelRendererExtended FrontFlipperL;
    private final AdvancedModelRendererExtended flipper2;
    private final AdvancedModelRendererExtended flipper6;
    private final AdvancedModelRendererExtended flipper7;
    private final AdvancedModelRendererExtended backflipperR;
    private final AdvancedModelRendererExtended backflipper3;
    private final AdvancedModelRendererExtended backflipperL;
    private final AdvancedModelRendererExtended backflipper2;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended fluke2;
    private final AdvancedModelRendererExtended fluke2a;
    private final AdvancedModelRendererExtended fluke1;

    private ModelAnimator animator;

    public ModelCartorhynchus() {
        this.textureWidth = 164;
        this.textureHeight = 132;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 15.0F, -6.0F);
        this.root.cubeList.add(new ModelBox(root, 73, 47, -5.0F, -5.1F, 8.9F, 10, 10, 13, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.root.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -5.5F, -5.5F, -18.0F, 11, 11, 18, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, -0.3F, -17.5F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0436F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 67, 73, -5.0F, -5.0F, -9.0F, 10, 10, 11, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -0.3F, -8.2F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0456F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 111, 30, -4.0F, -4.5F, -6.0F, 8, 9, 6, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -1.3F, -6.4F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.0456F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 108, 47, -3.5F, -2.9681F, -5.3007F, 7, 6, 6, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -1.5681F, -4.3007F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.6199F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 141, 34, -2.0F, -1.7F, -4.0F, 4, 3, 4, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 1.8F, -2.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.8196F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 135, 52, -2.5F, -1.0F, -4.0F, 5, 3, 4, 0.0F, false));

        this.rostrum1 = new AdvancedModelRendererExtended(this);
        this.rostrum1.setRotationPoint(0.0F, 1.0F, -4.1F);
        this.head3.addChild(rostrum1);
        this.setRotateAngle(rostrum1, 0.3187F, 0.0F, 0.0F);
        this.rostrum1.cubeList.add(new ModelBox(rostrum1, 148, 44, -1.5F, -1.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.rostrum2 = new AdvancedModelRendererExtended(this);
        this.rostrum2.setRotationPoint(0.0F, -1.2F, 0.8F);
        this.rostrum1.addChild(rostrum2);
        this.setRotateAngle(rostrum2, 0.2731F, 0.0F, 0.0F);
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 141, 27, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 2.9319F, 0.6993F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 121, 61, -3.5F, 0.0F, -6.0F, 7, 2, 6, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.5F, -5.8F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.182F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 142, 61, -2.5F, -0.5F, -3.9F, 5, 1, 4, 0.0F, false));

        this.lowerrostrum1 = new AdvancedModelRendererExtended(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 0.3F, -3.7F);
        this.jaw2.addChild(lowerrostrum1);
        this.setRotateAngle(lowerrostrum1, 0.3204F, 0.0F, 0.0F);
        this.lowerrostrum1.cubeList.add(new ModelBox(lowerrostrum1, 148, 67, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.jaw2.addChild(jaw3);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 136, 70, -1.0F, -0.6F, -6.0F, 2, 1, 6, 0.0F, false));

        this.gums = new AdvancedModelRendererExtended(this);
        this.gums.setRotationPoint(0.0F, 0.7F, -1.8F);
        this.jaw1.addChild(gums);
        this.setRotateAngle(gums, -0.4554F, 0.0F, 0.0F);
        this.gums.cubeList.add(new ModelBox(gums, 116, 73, -3.0F, -5.0F, -1.5F, 6, 5, 3, 0.0F, false));

        this.FrontFlipperR = new AdvancedModelRendererExtended(this);
        this.FrontFlipperR.setRotationPoint(-4.9F, 4.1F, -3.0F);
        this.chest1.addChild(FrontFlipperR);
        this.setRotateAngle(FrontFlipperR, 0.0F, 0.0F, 0.5918F);
        this.FrontFlipperR.cubeList.add(new ModelBox(FrontFlipperR, 2, 53, -0.8887F, -4.976F, -3.6366F, 2, 7, 7, 0.0F, false));

        this.flipper3 = new AdvancedModelRendererExtended(this);
        this.flipper3.setRotationPoint(6.6393F, -0.1631F, 0.0F);
        this.FrontFlipperR.addChild(flipper3);
        this.flipper3.cubeList.add(new ModelBox(flipper3, 2, 70, -7.0281F, 1.4872F, -3.1366F, 1, 5, 6, 0.0F, false));

        this.flipper4 = new AdvancedModelRendererExtended(this);
        this.flipper4.setRotationPoint(0.0F, 0.7F, -2.9F);
        this.flipper3.addChild(flipper4);
        this.flipper4.cubeList.add(new ModelBox(flipper4, 6, 76, -6.5281F, 1.4872F, -0.1366F, 0, 10, 10, 0.0F, false));

        this.flipper5 = new AdvancedModelRendererExtended(this);
        this.flipper5.setRotationPoint(6.6393F, -3.4631F, 0.0F);
        this.FrontFlipperR.addChild(flipper5);
        this.flipper5.cubeList.add(new ModelBox(flipper5, 27, 77, -6.5281F, 1.4872F, -0.1366F, 0, 4, 7, 0.0F, false));

        this.FrontFlipperL = new AdvancedModelRendererExtended(this);
        this.FrontFlipperL.setRotationPoint(4.9F, 4.1F, -3.0F);
        this.chest1.addChild(FrontFlipperL);
        this.setRotateAngle(FrontFlipperL, 0.0F, 0.0F, -0.5918F);
        this.FrontFlipperL.cubeList.add(new ModelBox(FrontFlipperL, 2, 53, -1.1113F, -4.976F, -3.6366F, 2, 7, 7, 0.0F, true));

        this.flipper2 = new AdvancedModelRendererExtended(this);
        this.flipper2.setRotationPoint(-6.6393F, -0.1631F, 0.0F);
        this.FrontFlipperL.addChild(flipper2);
        this.flipper2.cubeList.add(new ModelBox(flipper2, 2, 70, 6.0281F, 1.4872F, -3.1366F, 1, 5, 6, 0.0F, true));

        this.flipper6 = new AdvancedModelRendererExtended(this);
        this.flipper6.setRotationPoint(0.0F, 0.7F, -2.9F);
        this.flipper2.addChild(flipper6);
        this.flipper6.cubeList.add(new ModelBox(flipper6, 6, 76, 6.5281F, 1.4872F, -0.1366F, 0, 10, 10, 0.0F, true));

        this.flipper7 = new AdvancedModelRendererExtended(this);
        this.flipper7.setRotationPoint(-6.6393F, -3.4631F, 0.0F);
        this.FrontFlipperL.addChild(flipper7);
        this.flipper7.cubeList.add(new ModelBox(flipper7, 27, 77, 6.5281F, 1.4872F, -0.1366F, 0, 4, 7, 0.0F, true));

        this.backflipperR = new AdvancedModelRendererExtended(this);
        this.backflipperR.setRotationPoint(-4.2F, 3.8F, 17.9F);
        this.root.addChild(backflipperR);
        this.setRotateAngle(backflipperR, 0.1367F, 0.0F, 0.5918F);
        this.backflipperR.cubeList.add(new ModelBox(backflipperR, 58, 53, -1.0312F, -4.4309F, -2.9822F, 1, 7, 6, 0.0F, false));

        this.backflipper3 = new AdvancedModelRendererExtended(this);
        this.backflipper3.setRotationPoint(7.1114F, -4.5584F, -1.7144F);
        this.backflipperR.addChild(backflipper3);
        this.backflipper3.cubeList.add(new ModelBox(backflipper3, 48, 63, -7.6427F, 1.8275F, -1.0678F, 0, 12, 8, 0.0F, false));

        this.backflipperL = new AdvancedModelRendererExtended(this);
        this.backflipperL.setRotationPoint(4.2F, 3.8F, 17.9F);
        this.root.addChild(backflipperL);
        this.setRotateAngle(backflipperL, 0.1367F, 0.0F, -0.5918F);
        this.backflipperL.cubeList.add(new ModelBox(backflipperL, 58, 53, 0.0312F, -4.4309F, -2.9822F, 1, 7, 6, 0.0F, true));

        this.backflipper2 = new AdvancedModelRendererExtended(this);
        this.backflipper2.setRotationPoint(-7.1114F, -4.5584F, -1.7144F);
        this.backflipperL.addChild(backflipper2);
        this.backflipper2.cubeList.add(new ModelBox(backflipper2, 48, 63, 7.6427F, 1.8275F, -1.0678F, 0, 12, 8, 0.0F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.3F, 21.2F);
        this.root.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 93, 3, -3.5F, -4.5F, -2.2F, 7, 8, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.4F, 12.6F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 61, 19, -2.5F, -3.5F, 0.8F, 5, 7, 19, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 19.2F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 30, -1.5F, -2.5F, 0.0F, 3, 5, 17, 0.0F, false));

        this.fluke2 = new AdvancedModelRendererExtended(this);
        this.fluke2.setRotationPoint(0.0F, -1.3F, 0.6F);
        this.tail3.addChild(fluke2);
        this.fluke2.cubeList.add(new ModelBox(fluke2, 3, 31, -0.01F, -4.7F, -0.5F, 0, 5, 15, 0.0F, false));

        this.fluke2a = new AdvancedModelRendererExtended(this);
        this.fluke2a.setRotationPoint(0.0F, -0.6F, 0.8F);
        this.tail2.addChild(fluke2a);
        this.fluke2a.cubeList.add(new ModelBox(fluke2a, 4, 16, 0.0F, -9.2F, -1.0F, 0, 9, 20, 0.0F, false));

        this.fluke1 = new AdvancedModelRendererExtended(this);
        this.fluke1.setRotationPoint(0.0F, -0.7F, -0.2F);
        this.tail1.addChild(fluke1);
        this.fluke1.cubeList.add(new ModelBox(fluke1, 12, 17, 0.0F, -6.5F, 0.0F, 0, 6, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.125F);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.root.offsetZ = -0.6F;
        this.jaw1.rotateAngleX = (float) Math.toRadians(12.5);
        this.head1.rotateAngleX = (float) Math.toRadians(2.61);
        this.FrontFlipperR.rotateAngleZ = (float) Math.toRadians(68.91);
        this.FrontFlipperL.rotateAngleZ = (float) Math.toRadians(-68.91);
        this.backflipperL.rotateAngleZ = (float) Math.toRadians(-71.41);
        this.backflipperR.rotateAngleZ = (float) Math.toRadians(71.41);
        this.neck1.rotateAngleX = (float) Math.toRadians(-7.61);
        this.chest1.rotateAngleX = (float) Math.toRadians(-10.15);
        this.chest1.rotateAngleY = (float) Math.toRadians(9.84);
        this.body1.rotateAngleX = (float) Math.toRadians(-5);
        this.tail1.rotateAngleY = (float) Math.toRadians(-32.5);
        this.tail2.rotateAngleY = (float) Math.toRadians(-27.5);
        this.tail3.rotateAngleY = (float) Math.toRadians(-37.5);
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.root.offsetY = 1.34F;
        //this.root.offsetZ = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckHead = {this.neck1, this.head1};

        float speed = 0.19F;
        EntityPrehistoricFloraCartorhynchus ee = (EntityPrehistoricFloraCartorhynchus) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.785F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.955F * still, -1.55, f2, 0.6F * still);
            }
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.swing(root, speed * 0.5F, 0.002F, true, 0, 0, f2, 0.8F);

            //front left
            this.flap(FrontFlipperL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
            this.swing(FrontFlipperL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
            this.walk(FrontFlipperL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
            //front right
            this.flap(FrontFlipperR, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
            this.swing(FrontFlipperR, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
            this.walk(FrontFlipperR, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

            this.flap(backflipperL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
            this.swing(backflipperL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
            this.walk(backflipperL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

            this.flap(backflipperR, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
            this.swing(backflipperR, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
            this.walk(backflipperR, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        }
        else {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.backflipperL.rotateAngleZ = (float)Math.toRadians(-75);
            this.backflipperR.rotateAngleZ = (float)Math.toRadians(75);

            this.chainSwing(fishTail, speed * still * 0.7F, 0.385F * still * 0.7F, -1.85, f2, 0.6F * still * 0.7F);
            this.chainSwing(neckHead, speed * still * 0.7F, 0.285F * still * 0.7F, -1.15, f2, 0.6F * still * 0.7F);

            if (f3 == 0 || !ee.getIsMoving()) {
                this.FrontFlipperL.rotateAngleZ = (float)Math.toRadians(-85);
                this.FrontFlipperR.rotateAngleZ = (float)Math.toRadians(85);
                return;
            }

            this.FrontFlipperL.rotateAngleX = (float) Math.toRadians((-40F * ee.getMoveAngle2()) + 10F);
            this.FrontFlipperR.rotateAngleX = (float) Math.toRadians((-40F * ee.getMoveAngle2()) + 10F);

            this.swing(root, speed * 0.5F * 0.7F, 0.002F, true, 0, 0, f2, 0.8F * 0.7F);

            if (ee.getMoveAngle() >= 0) {
                this.body1.rotateAngleX = (float) Math.toRadians(-7.5 * ee.getMoveAngle());
                this.chest1.rotateAngleX = (float) Math.toRadians(-5.0 * ee.getMoveAngle());
                this.FrontFlipperL.rotateAngleZ = (float)Math.toRadians(-85 + (15 * ee.getMoveAngle()));
                this.FrontFlipperR.rotateAngleZ = (float)Math.toRadians(85 - (15 * ee.getMoveAngle()));
            }
            else {
                this.FrontFlipperL.rotateAngleZ = (float)Math.toRadians(-85);
                this.FrontFlipperR.rotateAngleZ = (float)Math.toRadians(85);
            }

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head1, 0,0,-0.2F);
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head1, 0,0,-0.2F);
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

