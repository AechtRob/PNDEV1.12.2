package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEryops;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEryops extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body3_r1;
    private final AdvancedModelRenderer body2_r1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck3_r1;
    private final AdvancedModelRenderer neck2_r1;
    private final AdvancedModelRenderer headpart;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head5_r1;
    private final AdvancedModelRenderer head4_r1;
    private final AdvancedModelRenderer head1_r1;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeL_r1;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeR_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw5_r1;
    private final AdvancedModelRenderer jaw4_r1;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer legFL;
    private final AdvancedModelRenderer legFL1;
    private final AdvancedModelRenderer legFL2;
    private final AdvancedModelRenderer legFR;
    private final AdvancedModelRenderer legFR1;
    private final AdvancedModelRenderer legFR2;
    private final AdvancedModelRenderer legHL;
    private final AdvancedModelRenderer legHL1;
    private final AdvancedModelRenderer legHL2;
    private final AdvancedModelRenderer legHR;
    private final AdvancedModelRenderer legHR1;
    private final AdvancedModelRenderer legHR2;

    private ModelAnimator animator;

    public ModelEryops() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -3.5F, -8.0F, 10, 8, 16, 0.0F, false));

        this.body3_r1 = new AdvancedModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, 5.0F, -15.0F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0873F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 0, 24, -4.0F, -10.5F, 14.25F, 8, 1, 8, 0.0F, false));

        this.body2_r1 = new AdvancedModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 5.0F, -15.0F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 24, 25, -4.0F, -8.5F, 7.5F, 8, 1, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-1.0F, -1.0F, -8.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 33, -3.5F, -2.49F, -4.0F, 9, 7, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 19, 108, -3.5F, -2.49F, 0.0F, 9, 7, 1, 0.0F, false));

        this.neck3_r1 = new AdvancedModelRenderer(this);
        this.neck3_r1.setRotationPoint(1.0F, 6.0F, -7.0F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.2182F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 50, 0, -4.0F, -4.2F, 3.1F, 8, 2, 4, 0.0F, false));

        this.neck2_r1 = new AdvancedModelRenderer(this);
        this.neck2_r1.setRotationPoint(1.0F, 6.0F, -7.0F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0436F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 52, 12, -4.0F, -8.5F, 3.5F, 8, 1, 4, 0.0F, false));

        this.headpart = new AdvancedModelRenderer(this);
        this.headpart.setRotationPoint(1.0F, 1.0F, -4.0F);
        this.neck.addChild(headpart);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.headpart.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 15, 62, -2.5F, -1.001F, -10.0F, 5, 2, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 55, -3.0F, -1.001F, -5.0F, 6, 2, 5, 0.0F, false));

        this.head5_r1 = new AdvancedModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0F, -0.1745F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 44, -3.75F, -7.0F, -6.25F, 2, 2, 10, 0.0F, false));

        this.head4_r1 = new AdvancedModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.1309F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 63, 25, -2.0F, -8.0F, -6.0F, 4, 2, 5, 0.0F, false));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 48, 48, -3.5F, -8.0F, -1.0F, 7, 2, 5, 0.0F, false));

        this.head1_r1 = new AdvancedModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0F, 0.1745F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 36, 0, 1.75F, -7.0F, -6.25F, 2, 2, 10, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(2.0F, -2.0F, -4.0F);
        this.head.addChild(eyeL);


        this.eyeL_r1 = new AdvancedModelRenderer(this);
        this.eyeL_r1.setRotationPoint(-2.0F, 8.0F, 1.0F);
        this.eyeL.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.1309F, 0.0F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 0, 72, 2.0F, -8.5F, -1.001F, 1, 2, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-2.0F, -2.0F, -4.0F);
        this.head.addChild(eyeR);


        this.eyeR_r1 = new AdvancedModelRenderer(this);
        this.eyeR_r1.setRotationPoint(2.0F, 8.0F, 1.0F);
        this.eyeR.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.1309F, 0.0F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 16, 72, -3.0F, -8.5F, -1.001F, 1, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.headpart.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 57, -2.501F, -1.499F, -9.75F, 5, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 55, -3.0F, -1.499F, -4.75F, 6, 2, 5, 0.0F, false));

        this.jaw5_r1 = new AdvancedModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.0F, 3.5F, -2.75F);
        this.jaw.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.1309F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 24, 48, -3.5F, -4.0F, -2.0F, 7, 2, 5, 0.0F, false));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 58, 58, -2.499F, -4.0F, -7.0F, 5, 2, 5, 0.0F, false));

        this.jaw4_r1 = new AdvancedModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, 3.5F, -2.75F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0F, -0.1745F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 30, 36, -3.75F, -5.0F, -6.0F, 2, 2, 10, 0.0F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 3.5F, -2.75F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0F, 0.1745F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 16, 34, 1.75F, -5.0F, -6.0F, 2, 2, 10, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 44, 34, -4.0F, -3.4F, -1.0F, 8, 7, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 20, -3.0F, -2.4F, 0.0F, 6, 6, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 3.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 62, -2.5F, -2.4F, 0.0F, 5, 5, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 3.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -2.0F, -1.65F, 0.0F, 4, 4, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.75F, 3.75F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 46, -1.5F, -1.4F, 0.0F, 3, 3, 4, 0.0F, false));

        this.legFL = new AdvancedModelRenderer(this);
        this.legFL.setRotationPoint(5.0F, 2.0F, -5.75F);
        this.body.addChild(legFL);
        this.legFL.cubeList.add(new ModelBox(legFL, 19, 93, -1.0F, -1.0F, -2.0F, 4, 3, 3, 0.0F, false));

        this.legFL1 = new AdvancedModelRenderer(this);
        this.legFL1.setRotationPoint(2.25F, 1.0F, -0.5F);
        this.legFL.addChild(legFL1);
        this.setRotateAngle(legFL1, -0.3491F, 0.0F, 0.0F);
        this.legFL1.cubeList.add(new ModelBox(legFL1, 9, 83, -1.01F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.legFL2 = new AdvancedModelRenderer(this);
        this.legFL2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legFL1.addChild(legFL2);
        this.setRotateAngle(legFL2, 0.3491F, 0.0F, 0.0F);
        this.legFL2.cubeList.add(new ModelBox(legFL2, 0, 101, -1.5F, 0.25F, -3.25F, 3, 1, 4, 0.0F, false));

        this.legFR = new AdvancedModelRenderer(this);
        this.legFR.setRotationPoint(-5.0F, 2.0F, -5.75F);
        this.body.addChild(legFR);
        this.legFR.cubeList.add(new ModelBox(legFR, 45, 80, -3.0F, -1.0F, -2.0F, 4, 3, 3, 0.0F, false));

        this.legFR1 = new AdvancedModelRenderer(this);
        this.legFR1.setRotationPoint(-2.25F, 1.0F, -0.5F);
        this.legFR.addChild(legFR1);
        this.setRotateAngle(legFR1, -0.3491F, 0.0F, 0.0F);
        this.legFR1.cubeList.add(new ModelBox(legFR1, 0, 83, -0.99F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.legFR2 = new AdvancedModelRenderer(this);
        this.legFR2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legFR1.addChild(legFR2);
        this.setRotateAngle(legFR2, 0.3491F, 0.0F, 0.0F);
        this.legFR2.cubeList.add(new ModelBox(legFR2, 0, 95, -1.5F, 0.25F, -3.25F, 3, 1, 4, 0.0F, false));

        this.legHL = new AdvancedModelRenderer(this);
        this.legHL.setRotationPoint(5.0F, 1.0F, 5.0F);
        this.body.addChild(legHL);
        this.legHL.cubeList.add(new ModelBox(legHL, 19, 100, -1.0F, -1.0F, -1.0F, 5, 3, 3, 0.0F, false));

        this.legHL1 = new AdvancedModelRenderer(this);
        this.legHL1.setRotationPoint(3.0F, 1.0F, 0.75F);
        this.legHL.addChild(legHL1);
        this.setRotateAngle(legHL1, 0.4363F, 0.0F, 0.0F);
        this.legHL1.cubeList.add(new ModelBox(legHL1, 32, 78, -1.51F, -0.25F, -1.5F, 3, 5, 3, 0.0F, false));

        this.legHL2 = new AdvancedModelRenderer(this);
        this.legHL2.setRotationPoint(-0.5F, 4.0F, -0.5F);
        this.legHL1.addChild(legHL2);
        this.setRotateAngle(legHL2, -0.48F, -0.3491F, 0.1309F);
        this.legHL2.cubeList.add(new ModelBox(legHL2, 0, 114, -1.5F, 0.25F, -3.25F, 4, 1, 4, 0.0F, false));

        this.legHR = new AdvancedModelRenderer(this);
        this.legHR.setRotationPoint(-5.0F, 0.0F, 5.0F);
        this.body.addChild(legHR);
        this.legHR.cubeList.add(new ModelBox(legHR, 33, 94, -4.0F, 0.0F, -1.0F, 5, 3, 3, 0.0F, false));

        this.legHR1 = new AdvancedModelRenderer(this);
        this.legHR1.setRotationPoint(-3.0F, 2.0F, 0.75F);
        this.legHR.addChild(legHR1);
        this.setRotateAngle(legHR1, 0.4363F, 0.0F, 0.0F);
        this.legHR1.cubeList.add(new ModelBox(legHR1, 34, 86, -1.49F, -0.25F, -1.5F, 3, 5, 3, 0.0F, false));

        this.legHR2 = new AdvancedModelRenderer(this);
        this.legHR2.setRotationPoint(0.5F, 4.0F, -0.5F);
        this.legHR1.addChild(legHR2);
        this.setRotateAngle(legHR2, -0.48F, 0.3491F, -0.1309F);
        this.legHR2.cubeList.add(new ModelBox(legHR2, 0, 108, -2.5F, 0.25F, -3.25F, 4, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.93F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw.rotateAngleX = (float) Math.toRadians(26);
        this.neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetY = 0.1F; //72

        EntityPrehistoricFloraEryops Eryops = (EntityPrehistoricFloraEryops) e;

        this.faceTarget(f3, f4, 4, headpart);

        float speed = 0.225F;
        if (Eryops.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.headpart, this.neck, this.body};

        if (!Eryops.isReallyInWater()) {

            if (Eryops.getBlinking()) {
                this.flap(eyeL,0.06F, 0.4F,false,0F,0.4F, f2, 1.0F);
                this.flap(eyeR,0.06F, -0.4F,true,0F,-0.4F, f2, 1.0F);
            }

            if (f3 == 0.0F || !Eryops.getIsMoving()) { //Not moving
                return;
            }

            this.flap(legHL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(legHL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legHL1, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(legHL2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(legHR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(legHR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legHR1, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(legHR2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legFL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(legFL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legFL1, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(legFL2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legFR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(legFR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legFR1, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(legFR2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            this.bob(body, speed*2, 0.3F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.legFL2.rotateAngleX = (float) Math.toRadians(70);
            this.legFR2.rotateAngleX = (float) Math.toRadians(70);
            this.legHL2.rotateAngleX = (float) Math.toRadians(50);
            this.legHR2.rotateAngleX = (float) Math.toRadians(50);

            this.legFL1.rotateAngleX= (float) Math.toRadians(40);
            this.legFR1.rotateAngleX= (float) Math.toRadians(40);
            this.legHL1.rotateAngleX= (float) Math.toRadians(50);
            this.legHR1.rotateAngleX= (float) Math.toRadians(50);

            AdvancedModelRenderer[] BackL = {this.legHL1, this.legHL2};
            AdvancedModelRenderer[] BackR = {this.legHR1, this.legHR2};

            this.flap(legHL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(legHR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(legFL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(legFL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(legFL1, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(legFL2, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(legFR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(legFR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(legFR1, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(legFR2, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.headpart, 0,0,-0.3F);
        animator.rotate(this.headpart, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.headpart, 0,0,-0.3F);
        animator.rotate(this.headpart, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
