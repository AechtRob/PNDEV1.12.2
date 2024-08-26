package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthostega;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAcanthostega extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tailfin1;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tailfin2;
    public AdvancedModelRendererExtended tailfin3;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended shape30;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended eyes1;
    public AdvancedModelRendererExtended eyes2;

    private ModelAnimator animator;

    public ModelAcanthostega() {
        this.textureWidth = 165;
        this.textureHeight = 85;
        this.chest = new AdvancedModelRendererExtended(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 6.6F, -8.2F);
        this.chest.addBox(-4.0F, -3.0F, 0.0F, 8, 6, 5, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.045553093477052F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 129, 0);
        this.upperleg1.setRotationPoint(-3.4F, 0.8F, 6.3F);
        this.upperleg1.addBox(-1.0F, -0.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(upperleg1, 0.22759093446006054F, 0.0F, 0.22759093446006054F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 117, 0);
        this.upperleg2.setRotationPoint(2.4F, 0.8F, 6.3F);
        this.upperleg2.addBox(-1.0F, -0.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(upperleg2, 0.22759093446006054F, 0.0F, -0.22759093446006054F);
        this.feet2 = new AdvancedModelRendererExtended(this, 57, 6);
        this.feet2.setRotationPoint(0.0F, 2.7F, 0.4F);
        this.feet2.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(feet2, 0.18203784098300857F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 80, 10);
        this.tail3.setRotationPoint(0.0F, -0.4F, 6.5F);
        this.tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 9, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 56, 0);
        this.upperarm2.setRotationPoint(2.7F, 1.8F, 2.3F);
        this.upperarm2.addBox(-1.0F, -0.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(upperarm2, 0.5009094953223726F, 0.0F, -0.40980330836826856F);
        this.eyes2 = new AdvancedModelRendererExtended(this, 96, 0);
        this.eyes2.setRotationPoint(2.4F, -1.7F, 0.6F);
        this.eyes2.addBox(-1.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(eyes2, -0.18203784098300857F, 0.0F, 0.0F);
        this.tailfin3 = new AdvancedModelRendererExtended(this, 0, 40);
        this.tailfin3.setRotationPoint(0.0F, -3.4F, 0.0F);
        this.tailfin3.addBox(0.0F, 0.0F, 0.0F, 0, 7, 11, 0.0F);
        this.shape30 = new AdvancedModelRendererExtended(this, 54, 21);
        this.shape30.setRotationPoint(0.0F, -2.7F, -2.2F);
        this.shape30.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(shape30, -0.40980330836826856F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 57, 6);
        this.hand2.setRotationPoint(0.0F, 2.7F, 0.4F);
        this.hand2.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(hand2, 0.18203784098300857F, 0.0F, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 62, 22);
        this.jaw3.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.jaw3.addBox(-2.5F, -0.5F, -6.0F, 5, 1, 12, 0.0F);
        this.setRotateAngle(jaw3, -0.136659280431156F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 135, 0);
        this.tail1.setRotationPoint(0.0F, 0.0F, 8.2F);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 6, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 28, 20);
        this.head2.setRotationPoint(0.0F, -1.5F, -4.9F);
        this.head2.addBox(-3.5F, -1.0F, -6.0F, 7, 2, 6, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 68, 0);
        this.neck1.setRotationPoint(0.0F, -0.9F, 0.3F);
        this.neck1.addBox(-4.5F, -2.2F, -4.0F, 9, 6, 4, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 151, 7);
        this.feet1.setRotationPoint(0.0F, 2.7F, 0.4F);
        this.feet1.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(feet1, 0.18203784098300857F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 0, 20);
        this.jaw1.setRotationPoint(0.0F, -0.5F, 1.1F);
        this.jaw1.addBox(-4.0F, 0.0F, -6.0F, 8, 2, 6, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 44, 6);
        this.leg2.setRotationPoint(0.5F, 2.1F, -0.4F);
        this.leg2.addBox(-1.0F, 0.0F, -1.1F, 2, 4, 3, 0.0F);
        this.setRotateAngle(leg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 73, 10);
        this.arm2.setRotationPoint(0.5F, 1.8F, -0.4F);
        this.arm2.addBox(-1.0F, 0.0F, -1.1F, 2, 4, 3, 0.0F);
        this.setRotateAngle(arm2, -0.36425021489121656F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 102, 15);
        this.head1.setRotationPoint(0.0F, 1.5F, -4.8F);
        this.head1.addBox(-4.0F, -3.5F, -5.0F, 8, 3, 6, 0.0F);
        this.setRotateAngle(head1, 0.045553093477052F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 94, 0);
        this.basin.setRotationPoint(0.0F, 1.2F, 10.3F);
        this.basin.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 9, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 60, 10);
        this.tail2.setRotationPoint(0.0F, 0.1F, 5.6F);
        this.tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
        this.tailfin2 = new AdvancedModelRendererExtended(this, 0, 34);
        this.tailfin2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.tailfin2.addBox(0.0F, 0.0F, 0.0F, 0, 8, 7, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 73, 10);
        this.arm1.setRotationPoint(0.5F, 1.8F, -0.4F);
        this.arm1.addBox(-1.0F, 0.0F, -1.1F, 2, 4, 3, 0.0F);
        this.setRotateAngle(arm1, -0.36425021489121656F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 57, 6);
        this.hand1.setRotationPoint(0.0F, 2.7F, 0.4F);
        this.hand1.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(hand1, 0.18203784098300857F, 0.0F, 0.0F);
        this.eyes1 = new AdvancedModelRendererExtended(this, 90, 0);
        this.eyes1.setRotationPoint(-1.6F, -1.7F, 0.7F);
        this.eyes1.addBox(-1.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(eyes1, -0.18203784098300857F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 84, 22);
        this.head3.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.head3.addBox(-3.0F, -0.5F, -6.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(head3, 0.136659280431156F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 13, 0);
        this.body.setRotationPoint(0.0F, -1.1F, 6.8F);
        this.body.addBox(-4.5F, -2.1F, -2.0F, 9, 7, 13, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 44, 0);
        this.upperarm1.setRotationPoint(-3.6F, 1.4F, 2.3F);
        this.upperarm1.addBox(-1.0F, -0.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(upperarm1, 0.5009094953223726F, 0.0F, 0.40980330836826856F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 124, 18);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -5.8F);
        this.jaw2.addBox(-3.0F, -1.0F, -6.0F, 6, 1, 6, 0.0F);
        this.leg1 = new AdvancedModelRendererExtended(this, 126, 8);
        this.leg1.setRotationPoint(0.5F, 2.1F, -0.4F);
        this.leg1.addBox(-1.0F, 0.0F, -1.1F, 2, 4, 3, 0.0F);
        this.setRotateAngle(leg1, 0.22759093446006054F, 0.0F, 0.0F);
        this.tailfin1 = new AdvancedModelRendererExtended(this, 0, 29);
        this.tailfin1.setRotationPoint(0.0F, -3.8F, 3.0F);
        this.tailfin1.addBox(0.0F, 0.0F, 0.0F, 0, 7, 3, 0.0F);
        this.basin.addChild(this.upperleg1);
        this.basin.addChild(this.upperleg2);
        this.leg2.addChild(this.feet2);
        this.tail2.addChild(this.tail3);
        this.chest.addChild(this.upperarm2);
        this.head2.addChild(this.eyes2);
        this.tail3.addChild(this.tailfin3);
        this.jaw1.addChild(this.shape30);
        this.arm2.addChild(this.hand2);
        this.jaw2.addChild(this.jaw3);
        this.basin.addChild(this.tail1);
        this.head1.addChild(this.head2);
        this.chest.addChild(this.neck1);
        this.leg1.addChild(this.feet1);
        this.head1.addChild(this.jaw1);
        this.upperleg2.addChild(this.leg2);
        this.upperarm2.addChild(this.arm2);
        this.neck1.addChild(this.head1);
        this.body.addChild(this.basin);
        this.tail1.addChild(this.tail2);
        this.tail2.addChild(this.tailfin2);
        this.upperarm1.addChild(this.arm1);
        this.arm1.addChild(this.hand1);
        this.head2.addChild(this.eyes1);
        this.head2.addChild(this.head3);
        this.chest.addChild(this.body);
        this.chest.addChild(this.upperarm1);
        this.jaw1.addChild(this.jaw2);
        this.upperleg1.addChild(this.leg1);
        this.tail1.addChild(this.tailfin1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(neck1, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(head1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(jaw1, 0.2F, 0.0F, 0.0F);
        this.chest.offsetY = -0.1F;
        this.chest.offsetX = -0.15F;
        this.chest.offsetZ = 0.07F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck1, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(head1, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(jaw1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.1F, 0.1F, 0.1F);
        this.setRotateAngle(tail2, 0.1F, -0.2F, 0.1F);
        this.setRotateAngle(tail3, 0.1F, -0.2F, 0.1F);
        this.setRotateAngle(upperarm1, -0.3F, 0.3F, 0.3F);
        this.setRotateAngle(arm1, -0.3F, 0.0F, 0.3F);
        this.setRotateAngle(hand1, 0.F, 0.0F, 0.3F);
        this.setRotateAngle(upperarm2, 0.3F, -0.3F, -0.3F);
        this.setRotateAngle(arm2, 0.3F, 0.0F, -0.3F);
        this.setRotateAngle(hand2, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(upperleg1, 0.3F, 0.0F, 0.5F);
        this.setRotateAngle(leg1, 0.3F, 0.3F, 0.3F);
        this.setRotateAngle(feet1, 0.0F, -0.3F, -0.2F);
        this.setRotateAngle(upperleg2, 0.3F, 0.0F, -0.5F);
        this.setRotateAngle(leg2, 0.3F, 0.3F, 0.3F);
        this.setRotateAngle(feet2, 0.0F, -0.3F, 0.2F);
        this.chest.offsetZ = -0.05F;
        this.chest.offsetY = -0.0F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.chest.offsetY = 0.7F;
        this.chest.offsetX = 0.1F;
        this.chest.rotateAngleY = (float) Math.toRadians(210);
        this.chest.rotateAngleX = (float) Math.toRadians(8);
        this.chest.rotateAngleZ = (float) Math.toRadians(-4);
        this.chest.scaleChildren = true;
        float scaler = 0.575F;
        this.chest.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arm1, 0.10F, 0.0F, 0.0F);
        this.setRotateAngle(hand1, 0.F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hand2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leg1, 0.10F, 0.0F, 0.0F);
        this.setRotateAngle(feet1, 0.F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(feet2, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.chest.render(f);
        //Reset rotations, positions and sizing:
        this.chest.setScale(1.0F, 1.0F, 1.0F);
        this.chest.scaleChildren = false;
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
        this.chest.offsetY = 0.80F; //72

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        EntityPrehistoricFloraAcanthostega Acanthostega = (EntityPrehistoricFloraAcanthostega) e;

        float speed = 0.225F;
        if (Acanthostega.getIsFast() && Acanthostega.isReallyInWater()) {
            speed = speed * 1.52F;
        }
        if (!Acanthostega.isReallyInWater()) {
            speed = speed * 0.35F;
        }
        AdvancedModelRenderer[] Tail = {this.body, this.basin, this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.neck1};
        Acanthostega.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] RearL = {this.upperleg2, this.leg2, this.feet2};
        AdvancedModelRenderer[] RearR = {this.upperleg1, this.leg1, this.feet1};
        AdvancedModelRenderer[] FrontL = {this.upperarm2, this.arm2, this.hand2};
        AdvancedModelRenderer[] FrontR = {this.upperarm1, this.arm1, this.hand1};

        if (!Acanthostega.isReallyInWater()) {
            //flatten arms out:
            this.setRotateAngle(upperleg2, 0.0F, 0.5236F, (float)Math.toRadians(-65));
            this.setRotateAngle(upperleg1, 0.0F, 0.5236F, (float)Math.toRadians(65));
            this.setRotateAngle(upperarm2, 0.0F, 0.5236F, (float)Math.toRadians(-78));
            this.setRotateAngle(upperarm1, 0.0F, 0.5236F, (float)Math.toRadians(78));

            if (f3 == 0.0F || !Acanthostega.getIsMoving()) { //Not moving
                return;
            }

            this.chainWaveExtended(RearL, speed, -0.25F, 0.2F, 0F, f2, 1.0F);
            this.chainWaveExtended(RearR, speed, -0.25F, 0.2F, 1F, f2, 1.0F);
            this.chainWaveExtended(FrontL, speed, -0.25F, 0.2F, 1F, f2, 1.0F);
            this.chainWaveExtended(FrontR, speed, -0.25F, 0.2F, 0F, f2, 1.0F);

            this.flap(upperleg2, speed, -0.15F, false, 1F, 0.075F, f2, 1.0F);
            this.flap(upperleg1, speed, 0.15F, false, 2F, -0.075F, f2, 1.0F);
            this.flap(upperarm2, speed, -0.15F, false, 2F, 0.075F, f2, 1.0F);
            this.flap(upperarm1, speed, 0.15F, false, 1F, -0.075F, f2, 1.0F);

            this.chainWave(Tail, speed, 0.0225F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(chest, speed*2, 0.3F, false, f2, 1F);

            this.chest.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            this.chainWaveExtended(RearL, speed, -0.35F, 0.3F, 0F, f2, 1.0F);
            this.chainWaveExtended(RearR, speed, -0.35F, 0.3F, 1F, f2, 1.0F);
            this.chainWaveExtended(FrontL, speed, -0.35F, 0.3F, 1F, f2, 1.0F);
            this.chainWaveExtended(FrontR, speed, -0.35F, 0.3F, 0F, f2, 1.0F);

            this.flap(upperleg2, speed, -0.35F, false, 1F, 0.075F, f2, 1.0F);
            this.flap(upperleg1, speed, 0.35F, false, 2F, -0.075F, f2, 1.0F);
            this.flap(upperarm2, speed, -0.35F, false, 2F, 0.075F, f2, 1.0F);
            this.flap(upperarm1, speed, 0.35F, false, 1F, -0.075F, f2, 1.0F);

            this.chainWave(Tail, speed, 0.1F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.4, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);

            this.bob(chest, speed * 2, 0.3F, false, f2, 1F);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
