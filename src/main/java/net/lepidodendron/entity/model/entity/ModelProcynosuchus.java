package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProcynosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelProcynosuchus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended body;
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
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperle2;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;

    private ModelAnimator animator;

    public ModelProcynosuchus() {
        this.textureWidth = 85;
        this.textureHeight = 65;
        this.upperarm2 = new AdvancedModelRendererExtended(this, 74, 23);
        this.upperarm2.setRotationPoint(2.3F, 0.5F, -2.5F);
        this.upperarm2.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F);
        this.setRotateAngle(upperarm2, 0.5462880558742251F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 1, 1);
        this.body.setRotationPoint(0.0F, -0.7F, 1.2F);
        this.body.addBox(-3.0F, -2.0F, -0.0F, 6, 6, 13, 0.0F);
        this.setRotateAngle(body, -0.091106186954104F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 69, 49);
        this.jaw2.setRotationPoint(0.0F, -0.05F, -2.7F);
        this.jaw2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(jaw2, 0.091106186954104F, 0.0F, 0.0F);
        this.nose2 = new AdvancedModelRendererExtended(this, 31, 37);
        this.nose2.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.nose2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose2, 0.31869712141416456F, 0.0F, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 62, 30);
        this.arm1.setRotationPoint(-0.4F, 2.9F, -0.2F);
        this.arm1.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(arm1, -0.8196066167365371F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 0, 21);
        this.chest.setRotationPoint(0.0F, 16.0F, -6.0F);
        this.chest.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(chest, 0.091106186954104F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 1, 36);
        this.tail1.setRotationPoint(0.0F, 0.1F, 3.4F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 66, 45);
        this.jaw1.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.jaw1.addBox(-2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 50, 0);
        this.upperleg1.setRotationPoint(-2.3F, -0.1F, 2.4F);
        this.upperleg1.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 4, 0.0F);
        this.setRotateAngle(upperleg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.leg1 = new AdvancedModelRendererExtended(this, 50, 10);
        this.leg1.setRotationPoint(-0.4F, 4.1F, -0.6F);
        this.leg1.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(leg1, 0.9560913642424937F, 0.0F, 0.0F);
        this.gums1 = new AdvancedModelRendererExtended(this, 37, 35);
        this.gums1.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.gums1.addBox(-2.0F, -3.0F, -0.5F, 4, 3, 2, 0.0F);
        this.setRotateAngle(gums1, -0.5009094953223726F, 0.0F, 0.0F);
        this.nose1 = new AdvancedModelRendererExtended(this, 29, 34);
        this.nose1.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.nose1.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(nose1, 0.136659280431156F, 0.0F, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 74, 30);
        this.arm2.setRotationPoint(-0.6F, 2.9F, -0.2F);
        this.arm2.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(arm2, -0.8196066167365371F, 0.0F, 0.0F);
        this.teeth1_1 = new AdvancedModelRendererExtended(this, 50, 35);
        this.teeth1_1.setRotationPoint(0.0F, -1.0F, -1.8F);
        this.teeth1_1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(teeth1_1, -0.136659280431156F, 0.0F, 0.0F);
        this.feet2 = new AdvancedModelRendererExtended(this, 46, 19);
        this.feet2.setRotationPoint(0.5F, 5.1F, 0.8F);
        this.feet2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(feet2, -0.36425021489121656F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 46, 19);
        this.feet1.setRotationPoint(0.5F, 5.1F, 0.8F);
        this.feet1.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(feet1, -0.36425021489121656F, -0.01749704343004267F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 50, 35);
        this.teeth1.setRotationPoint(0.0F, 0.4F, -2.8F);
        this.teeth1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(teeth1, 0.18203784098300857F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 62, 39);
        this.hand2.setRotationPoint(0.5F, 4.5F, 0.0F);
        this.hand2.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(hand2, 0.22759093446006054F, 0.0F, 0.0F);
        this.upperle2 = new AdvancedModelRendererExtended(this, 73, 0);
        this.upperle2.setRotationPoint(2.3F, -0.1F, 2.4F);
        this.upperle2.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 4, 0.0F);
        this.setRotateAngle(upperle2, -0.4553564018453205F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 17, 33);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.6F);
        this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail2, 0.18203784098300857F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 73, 10);
        this.leg2.setRotationPoint(-0.6F, 4.1F, -0.6F);
        this.leg2.addBox(-0.5F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(leg2, 0.9560913642424937F, 0.0F, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 62, 23);
        this.upperarm1.setRotationPoint(-2.3F, 0.5F, -2.7F);
        this.upperarm1.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F);
        this.setRotateAngle(upperarm1, 0.5918411493512771F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 47, 41);
        this.head1.setRotationPoint(0.0F, -0.2F, -5.2F);
        this.head1.addBox(-2.5F, -2.0F, -3.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(head1, 0.22759093446006054F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 23, 22);
        this.neck1.setRotationPoint(0.0F, -0.3F, -3.3F);
        this.neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(neck1, -0.18203784098300857F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 55, 51);
        this.head2.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.head2.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(head2, 0.091106186954104F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 62, 39);
        this.hand1.setRotationPoint(0.5F, 4.5F, 0.0F);
        this.hand1.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(hand1, 0.18203784098300857F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 27, 0);
        this.basin.setRotationPoint(0.0F, 0.6F, 12.3F);
        this.basin.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(basin, -0.136659280431156F, 0.0F, 0.0F);
        this.chest.addChild(this.upperarm2);
        this.chest.addChild(this.body);
        this.jaw1.addChild(this.jaw2);
        this.nose1.addChild(this.nose2);
        this.upperarm1.addChild(this.arm1);
        this.basin.addChild(this.tail1);
        this.head1.addChild(this.jaw1);
        this.basin.addChild(this.upperleg1);
        this.upperleg1.addChild(this.leg1);
        this.jaw1.addChild(this.gums1);
        this.head2.addChild(this.nose1);
        this.upperarm2.addChild(this.arm2);
        this.jaw2.addChild(this.teeth1_1);
        this.leg2.addChild(this.feet2);
        this.leg1.addChild(this.feet1);
        this.head2.addChild(this.teeth1);
        this.arm2.addChild(this.hand2);
        this.basin.addChild(this.upperle2);
        this.tail1.addChild(this.tail2);
        this.upperle2.addChild(this.leg2);
        this.chest.addChild(this.upperarm1);
        this.neck1.addChild(this.head1);
        this.chest.addChild(this.neck1);
        this.head1.addChild(this.head2);
        this.arm1.addChild(this.hand1);
        this.body.addChild(this.basin);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5 * 0.35f);
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
        this.chest.offsetY = 0.95F;

        EntityPrehistoricFloraProcynosuchus Procynosuchus = (EntityPrehistoricFloraProcynosuchus) e;
        float masterSpeed = Procynosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 5, neck1);
        this.faceTarget(f3, f4, 5, head1);

        AdvancedModelRenderer[] Tail = {this.basin, this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.head1, this.neck1};

        AdvancedModelRenderer[] Whole = {this.head1, this.neck1, this.chest, this.body, this.basin, this.tail1, this.tail2};

        AdvancedModelRenderer[] BackLeft = {this.upperle2, this.leg2, this.feet2};
        AdvancedModelRenderer[] BackRight = {this.upperleg1, this.leg1, this.feet1};
        AdvancedModelRenderer[] FrontLeft = {this.upperarm2, this.arm2, this.hand2};
        AdvancedModelRenderer[] FrontRight = {this.upperarm1, this.arm1, this.hand1};

        if (Procynosuchus.getAnimation() == Procynosuchus.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        float speed = masterSpeed / 0.565F;
        if (Procynosuchus.getIsFast()) {
            speed = speed * 1.5F;
        }

        if (!Procynosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Procynosuchus.getIsMoving()) {
                this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
                this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
                this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
                this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
                return;
            }

            this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 1, f2, 1.5F);;
            this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 4, f2, 1.5F);;
            this.upperle2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 4, f2, 1.5F);;
            this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 1, f2, 1.5F);;

            this.flap(upperarm2, speed, -0.1F, true, 4, 0.05F, f2, 1F);
            this.flap(upperarm1, speed, 0.1F, true, 7, -0.05F, f2, 1F);
            this.flap(upperle2, speed, 0.1F, false, 7, -0.05F, f2, 1F);
            this.flap(upperleg1, speed, -0.1F, false, 4, 0.05F, f2, 1F);

            //this.swing(upperarm2, speed, -0.40F, true, 5, 0.18F, f2, 1F);
            //this.swing(upperarm1, speed, 0.40F, true, 8, -0.18F, f2, 1F);
            //this.swing(upperle2, speed, -0.30F, true, 8, 0F, f2, 1F);
            //this.swing(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

            this.walk(upperarm2, speed, -0.40F, true, 0, 0.18F, f2, 1F);
            this.walk(upperarm1, speed, -0.40F, true, 3, 0.18F, f2, 1F);
            this.walk(upperle2, speed, -0.30F, true, 3, 0F, f2, 1F);
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

            this.bobExtended(chest, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

            //this.flap(basin, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
            this.flap(body, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

            //this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

            this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            this.chest.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 1.5F, f2, 1);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            //Swimming pose:
            speed = masterSpeed / 1.265F;
            if (Procynosuchus.getIsFast()) {
                speed = speed * 1.5F;
            }

            this.setRotateAngle(feet2, 0.6829473363053812F, 0.0F, 0.0F);
            this.setRotateAngle(leg1, 0.9560913642424937F, 0.0F, 0.0F);
            this.setRotateAngle(upperle2, 0.6373942428283291F, 0.0F, 0.0F);
            this.setRotateAngle(leg2, 0.9560913642424937F, 0.0F, 0.0F);
            this.setRotateAngle(hand1, 0.8196066167365371F, 0.0F, 0.0F);
            this.setRotateAngle(arm2, -0.045553093477052F, 0.0F, 0.0F);
            this.setRotateAngle(upperarm1, 0.9560913642424937F, 0.0017453292519943296F, 0.0F);
            this.setRotateAngle(hand2, 0.8196066167365371F, 0.0F, 0.0F);
            this.setRotateAngle(feet1, 0.6829473363053812F, -0.017453292519943295F, 0.0F);
            this.setRotateAngle(arm1, -0.045553093477052F, 0.0F, 0.0F);
            this.setRotateAngle(upperleg1, 0.6373942428283291F, 0.0F, 0.0F);
            this.setRotateAngle(upperarm2, 0.9560913642424937F, 0.0F, 0.0F);
            // ----------

            speed = speed * 1.5F;

            this.chainWave(Whole, speed, 0.08F, -3.2, f2, 1);
            this.chainSwing(Whole, speed * 2, 0.02F, -3.2, f2, 1);
            this.walk(neck1, speed, -0.10F, false, 0F, -0.05F, f2, 1F);
            this.chainWaveExtended(BackLeft, speed, -0.05F, -0.05, 0F, f2, 1);
            this.chainWaveExtended(BackRight, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontLeft, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontRight, speed, -0.05F, -0.05, 0F, f2, 1);
            this.bob(chest, speed, 0.15F, false, f2, 1);
            this.walk(chest, speed, 0.08F, false, 0F, 0.04F, f2, 1);

            if (f3 == 0.0F) {
                return;
            }

            //this.chainSwing(Tail, speed, 0.05F, -2, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProcynosuchus e = (EntityPrehistoricFloraProcynosuchus) entity;
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
    }
}
