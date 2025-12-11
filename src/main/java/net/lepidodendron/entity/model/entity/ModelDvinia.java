package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDvinia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDvinia extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended nose1;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended nose2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended teeth1_1;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;

    private ModelAnimator animator;

    public ModelDvinia() {
        this.textureWidth = 64;
        this.textureHeight = 35;
        this.gums1 = new AdvancedModelRendererExtended(this, 52, 30);
        this.gums1.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.gums1.addBox(-2.0F, -3.0F, -0.5F, 4, 3, 2, 0.0F);
        this.setRotateAngle(gums1, -0.5009094953223726F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 41, 8);
        this.leg2.setRotationPoint(-0.6F, 3.3F, -0.4F);
        this.leg2.addBox(-0.5F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leg2, 0.9560913642424937F, 0.0F, -0.01117010721276371F);
        this.tail2 = new AdvancedModelRendererExtended(this, 36, 30);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail2, 0.18203784098300857F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 0, 14);
        this.chest.setRotationPoint(0.0F, 0.6F, -7.2F);
        this.chest.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(chest, 0.091106186954104F, 0.0F, 0.0F);
        this.nose1 = new AdvancedModelRendererExtended(this, 36, 27);
        this.nose1.setRotationPoint(0.0F, -0.1F, -3.3F);
        this.nose1.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(nose1, 0.18203784098300857F, 0.0F, 0.0F);
        this.feet2 = new AdvancedModelRendererExtended(this, 39, 15);
        this.feet2.setRotationPoint(0.5F, 3.9F, 0.0F);
        this.feet2.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(feet2, -0.36425021489121656F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 50, 13);
        this.hand1.setRotationPoint(0.5F, 3.9F, 0.0F);
        this.hand1.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(hand1, 0.18203784098300857F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 0, 27);
        this.jaw2.setRotationPoint(0.0F, 0.05F, -2.8F);
        this.jaw2.addBox(-1.5F, -0.5F, -3.4F, 3, 1, 4, 0.0F);
        this.setRotateAngle(jaw2, 0.18203784098300857F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 0, 23);
        this.jaw1.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.jaw1.addBox(-2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 39, 15);
        this.feet1.setRotationPoint(0.5F, 3.9F, 0.0F);
        this.feet1.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(feet1, -0.36425021489121656F, 0.0F, 0.0F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 41, 0);
        this.upperleg2.setRotationPoint(2.3F, -0.1F, 2.4F);
        this.upperleg2.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(upperleg2, -0.4553564018453205F, 0.0F, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 52, 0);
        this.upperarm2.setRotationPoint(2.3F, 0.7F, -3.0F);
        this.upperarm2.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(upperarm2, 0.5462880558742251F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 22, 0);
        this.basin.setRotationPoint(0.0F, 17.0F, 4.7F);
        this.basin.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(basin, -0.136659280431156F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 44, 24);
        this.head2.setRotationPoint(0.0F, -0.1F, -2.6F);
        this.head2.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(head2, 0.18203784098300857F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 29, 20);
        this.head1.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.head1.addBox(-2.5F, -2.0F, -3.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(head1, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 27, 10);
        this.tail1.setRotationPoint(0.0F, 0.1F, 3.4F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.nose2 = new AdvancedModelRendererExtended(this, 35, 30);
        this.nose2.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.nose2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose2, 0.31869712141416456F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 14, 22);
        this.neck1.setRotationPoint(0.0F, -0.3F, -3.3F);
        this.neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(neck1, -0.18203784098300857F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 50, 13);
        this.hand2.setRotationPoint(0.5F, 3.9F, 0.0F);
        this.hand2.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(hand2, 0.22759093446006054F, 0.0F, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 52, 6);
        this.arm2.setRotationPoint(-0.6F, 2.2F, -0.2F);
        this.arm2.addBox(-0.5F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm2, -0.8196066167365371F, 0.0F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 41, 0);
        this.upperleg1.setRotationPoint(-2.3F, -0.1F, 2.4F);
        this.upperleg1.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(upperleg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.teeth1_1 = new AdvancedModelRendererExtended(this, 55, 22);
        this.teeth1_1.setRotationPoint(0.0F, -0.9F, -1.1F);
        this.teeth1_1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 52, 6);
        this.arm1.setRotationPoint(-0.4F, 2.2F, -0.2F);
        this.arm1.addBox(-0.5F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm1, -0.8196066167365371F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 1, 1);
        this.body.setRotationPoint(0.0F, -0.3F, 0.4F);
        this.body.addBox(-3.0F, -2.0F, -8.0F, 6, 5, 8, 0.0F);
        this.setRotateAngle(body, 0.091106186954104F, 0.0F, 0.0F);
        this.leg1 = new AdvancedModelRendererExtended(this, 41, 8);
        this.leg1.setRotationPoint(-0.4F, 3.3F, -0.4F);
        this.leg1.addBox(-0.5F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leg1, 0.9560913642424937F, 0.0F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 53, 18);
        this.teeth1.setRotationPoint(0.0F, 0.6F, -1.8F);
        this.teeth1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 52, 0);
        this.upperarm1.setRotationPoint(-2.3F, 0.7F, -3.0F);
        this.upperarm1.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(upperarm1, 0.5918411493512771F, 0.0F, 0.0F);
        this.jaw1.addChild(this.gums1);
        this.upperleg2.addChild(this.leg2);
        this.tail1.addChild(this.tail2);
        this.body.addChild(this.chest);
        this.head2.addChild(this.nose1);
        this.leg2.addChild(this.feet2);
        this.arm1.addChild(this.hand1);
        this.jaw1.addChild(this.jaw2);
        this.head1.addChild(this.jaw1);
        this.leg1.addChild(this.feet1);
        this.basin.addChild(this.upperleg2);
        this.chest.addChild(this.upperarm2);
        this.head1.addChild(this.head2);
        this.neck1.addChild(this.head1);
        this.basin.addChild(this.tail1);
        this.nose1.addChild(this.nose2);
        this.chest.addChild(this.neck1);
        this.arm2.addChild(this.hand2);
        this.upperarm2.addChild(this.arm2);
        this.basin.addChild(this.upperleg1);
        this.jaw2.addChild(this.teeth1_1);
        this.upperarm1.addChild(this.arm1);
        this.basin.addChild(this.body);
        this.upperleg1.addChild(this.leg1);
        this.head2.addChild(this.teeth1);
        this.chest.addChild(this.upperarm1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin.render(f5);
    }

    public void renderStaticFloor(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.basin.rotateAngleX = (float) Math.toRadians(-60);
        this.upperleg1.rotateAngleX = (float) Math.toRadians(30);
        this.upperleg2.rotateAngleX = (float) Math.toRadians(30);
        this.body.rotateAngleX = (float) Math.toRadians(-10);
        this.neck1.rotateAngleX = (float) Math.toRadians(35);
        this.head1.rotateAngleX = (float) Math.toRadians(15);
        this.upperarm2.rotateAngleX = (float) Math.toRadians(40);
        this.upperarm1.rotateAngleX = (float) Math.toRadians(40);
        this.hand2.rotateAngleX = (float) Math.toRadians(75);
        this.hand1.rotateAngleX = (float) Math.toRadians(75);
        this.tail1.rotateAngleX = (float) Math.toRadians(38);
        this.tail2.rotateAngleX = (float) Math.toRadians(25);
        this.basin.render(0.01F);
        resetToDefaultPose();
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.basin.offsetY = -0.1F;
        this.basin.offsetX = -0.1F;
        this.basin.offsetZ = 2.0F;
        this.basin.rotateAngleY = (float)Math.toRadians(120);
        this.basin.rotateAngleX = (float)Math.toRadians(1);
        this.basin.rotateAngleZ = (float)Math.toRadians(0);
        this.basin.scaleChildren = true;
        float scaler = 0.8F;
        this.basin.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(basin, 0.0F, 3.8F, -0.0F);
        this.upperleg1.rotateAngleX = (float) Math.toRadians(30);
        this.upperleg2.rotateAngleX = (float) Math.toRadians(30);
        this.body.rotateAngleX = (float) Math.toRadians(-10);
        this.neck1.rotateAngleX = (float) Math.toRadians(35);
        this.head1.rotateAngleX = (float) Math.toRadians(15);
        this.upperarm2.rotateAngleX = (float) Math.toRadians(40);
        this.upperarm1.rotateAngleX = (float) Math.toRadians(40);
        this.hand2.rotateAngleX = (float) Math.toRadians(75);
        this.hand1.rotateAngleX = (float) Math.toRadians(75);
        this.tail1.rotateAngleX = (float) Math.toRadians(38);
        this.tail2.rotateAngleX = (float) Math.toRadians(25);
        //End of pose, now render the model:
        this.basin.render(f);
        //Reset rotations, positions and sizing:
        this.basin.setScale(1.0F, 1.0F, 1.0F);
        this.basin.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.basin.offsetY = 1.05F;

        EntityPrehistoricFloraDvinia Dvinia = (EntityPrehistoricFloraDvinia) e;
        float masterSpeed = Dvinia.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck1);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        if (Dvinia.getAnimation() == Dvinia.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Dvinia.getScreaming()) {
            this.neck1.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(head1, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (Dvinia.getAnimation() == Dvinia.LOOK_ANIMATION) {
            this.chainWave(Tail, (0.06F*0.9F), 0.20F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 3F, 0.35F, 0.06F, f2, 1F);
            this.swing(neck1, 0.06F, 0.05F, false, 0.5F,-0.025F, f2, 0.7F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.7F);
            this.walk(upperarm2, 0.4F, -0.15F, true, 0, -0.05F, f2, 1F);
            this.walk(upperarm1, 0.4F, -0.15F, true, 3, -0.05F, f2, 1F);
            this.walk(hand2, 0.4F, -0.15F, true, 1, -0.05F, f2, 1F);
            this.walk(hand1, 0.4F, -0.15F, true, 4, -0.05F, f2, 1F);
            this.walk(hand1, 0.06F * 2F, -0.02F, false, 1F,0.01F, f2, 0.7F);
            this.walk(hand2, 0.06F * 2F, -0.02F, false, 4F,0.01F, f2, 0.7F);
            return;
        }

        if (f3 == 0.0F || !Dvinia.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (Dvinia.getIsFast()) {
            speed = speed * 1.5F;
        }

        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.flap(upperarm2, speed, -0.1F, true, 4, 0.05F, f2, 1F);
        this.flap(upperarm1, speed, 0.1F, true, 7, -0.05F, f2, 1F);
        this.flap(upperleg2, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(upperleg1, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        //this.swing(upperarm2, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        //this.swing(upperarm1, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        //this.swing(upperleg2, speed, -0.30F, true, 8, 0F, f2, 1F);
        //this.swing(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(upperarm2, speed, -0.40F, true, 0, 0.18F, f2, 1F);
        this.walk(upperarm1, speed, -0.40F, true, 3, 0.18F, f2, 1F);
        this.walk(upperleg2, speed, -0.30F, true, 3, 0F, f2, 1F);
        this.walk(upperleg1, speed, -0.30F, true, 0, 0F, f2, 1F);

        this.swing(arm2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(arm1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(feet2, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(feet1, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(arm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(arm1, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(feet2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(feet1, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.swing(hand2, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.swing(hand1, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.swing(feet2, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.swing(feet1, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(basin, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(basin, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
        this.flap(body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDvinia e = (EntityPrehistoricFloraDvinia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LOOK_ANIMATION); //180 ticks
        animator.startKeyframe(15);
        animator.move(this.basin, 0, -1.80F, 0);
        animator.rotate(this.basin, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.hand2, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.hand1, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(38), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(150);
        animator.resetKeyframe(15);
    }
}
