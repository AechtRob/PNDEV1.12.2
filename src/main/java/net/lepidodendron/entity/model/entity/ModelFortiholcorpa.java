package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraFortiholcorpa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFortiholcorpa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer scorpionfly;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer abdomen4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer abdomen5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer abdomen6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer abdomen7;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelFortiholcorpa() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.scorpionfly = new AdvancedModelRenderer(this);
        this.scorpionfly.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -5.2F, -1.8F);
        this.scorpionfly.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 13, 37, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.0F, -0.009F, -0.85F);
        this.thorax.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0F, 1.0908F, 0.0F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 27, -11.9498F, 0.099F, -0.0344F, 12, 0, 4, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.0F, -0.025F, -1.75F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, 1.1345F, 0.0F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 15, 0, -12.7636F, 0.035F, -0.1087F, 13, 0, 4, 0.0F, true));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.0F, -0.025F, -1.75F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, -1.1345F, 0.0F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 15, 0, -0.2364F, 0.025F, -0.1087F, 13, 0, 4, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.0F, -0.009F, -0.85F);
        this.thorax.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0F, -1.0908F, 0.0F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 27, -0.0502F, 0.1F, -0.0344F, 12, 0, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.6F, 1.7F, -1.4F);
        this.thorax.addChild(rightLeg1);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.6F, -1.1F, -7.3F);
        this.rightLeg1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -4.5F, 0.6F, -0.2F, 0, 4, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.6619F, 1.7F, -1.124F);
        this.thorax.addChild(rightLeg2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.1F, 11.0F);
        this.rightLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 2.3126F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 8.128F, -2.6F, 1.5996F, 0, 4, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.7882F, 1.7F, -0.629F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.1745F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5635F, -1.0F, 3.5135F);
        this.rightLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 2.9671F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 27, -2.884F, 0.5F, -4.8794F, 0, 4, 9, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.6F, 1.7F, -1.4F);
        this.thorax.addChild(leftLeg1);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.6F, -1.1F, -7.3F);
        this.leftLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7418F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, 4.5F, 0.6F, -0.2F, 0, 4, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.6619F, 1.7F, -1.124F);
        this.thorax.addChild(leftLeg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.1F, 11.0F);
        this.leftLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -2.3126F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -8.128F, -2.6F, 1.5996F, 0, 4, 6, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.7882F, 1.7F, -0.629F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.1745F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.5635F, -1.0F, 3.5135F);
        this.leftLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -2.9671F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 27, 2.884F, 0.5F, -4.8794F, 0, 4, 9, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.8506F, -1.8219F);
        this.thorax.addChild(neck);
        this.setRotateAngle(neck, 0.3491F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.1506F, -0.6781F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 0, 0.5F, -0.4F, -0.7F, 1, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.1789F, -0.3208F, -1.0559F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 5, 11, -0.6789F, -0.2373F, -0.7233F, 1, 1, 1, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7789F, 0.9595F, -2.2006F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 11, -1.5387F, -1.1968F, 1.4258F, 1, 1, 1, -0.05F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4211F, 0.9595F, -2.2006F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 11, 0.5387F, -1.1968F, 1.4258F, 1, 1, 1, -0.05F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1789F, 1.7595F, -2.1006F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 0, 0.0F, -1.3578F, 1.2095F, 0, 2, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.1716F, 0.5151F, -0.7212F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0436F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0505F, -0.4448F, 0.0139F);
        this.leftAntenna.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1874F, -0.531F, -0.1431F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 5, 0.0F, -3.3487F, -6.8017F, 0, 4, 7, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5293F, 0.5151F, -0.7212F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0505F, -0.4448F, 0.0139F);
        this.rightAntenna.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1874F, 0.531F, 0.1431F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 5, 0.0F, -3.3487F, -6.8017F, 0, 4, 7, 0.0F, true));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, -5.1647F, -1.7864F);
        this.scorpionfly.addChild(abdomen1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.2F, 1.3F);
        this.abdomen1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 21, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 1.3F, 2.8F);
        this.abdomen1.addChild(abdomen2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.1F, -1.5F);
        this.abdomen2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 5, -1.0F, -1.0F, 1.4F, 2, 2, 3, -0.01F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, 0.8674F, 2.704F);
        this.abdomen2.addChild(abdomen3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.8298F, -0.7517F);
        this.abdomen3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 32, -1.0F, 0.4649F, 0.5541F, 2, 1, 3, -0.03F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.648F, -1.9475F);
        this.abdomen3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 27, -1.0F, -1.0F, 1.8F, 2, 1, 3, -0.02F, false));

        this.abdomen4 = new AdvancedModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, 0.3326F, 2.596F);
        this.abdomen3.addChild(abdomen4);
        this.setRotateAngle(abdomen4, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.3075F, 2.1041F);
        this.abdomen4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 5, -0.5F, -0.3355F, -2.3148F, 1, 1, 3, -0.01F, false));

        this.abdomen5 = new AdvancedModelRenderer(this);
        this.abdomen5.setRotationPoint(0.0F, 0.259F, 2.1593F);
        this.abdomen4.addChild(abdomen5);
        this.setRotateAngle(abdomen5, -0.4363F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.7355F, 0.6216F);
        this.abdomen5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 7, 0.0F, -2.95F, -1.5F, 0, 5, 14, 0.0F, false));

        this.abdomen6 = new AdvancedModelRenderer(this);
        this.abdomen6.setRotationPoint(-0.01F, -8.264F, 11.5779F);
        this.abdomen5.addChild(abdomen6);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.01F, 7.1285F, -9.7562F);
        this.abdomen6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.01F, -8.95F, -1.5F, 0, 6, 14, 0.0F, false));

        this.abdomen7 = new AdvancedModelRenderer(this);
        this.abdomen7.setRotationPoint(0.01F, -1.4715F, -12.0562F);
        this.abdomen6.addChild(abdomen7);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.3695F, 0.9497F, -1.7152F);
        this.abdomen7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3079F, 0.1248F, 0.0396F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.3695F, 0.9497F, -1.7152F);
        this.abdomen7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3079F, -0.1248F, -0.0396F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 9, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 7.4F, -10.7F);
        this.abdomen7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 11, 1.0F, -3.95F, 11.5F, 1, 1, 1, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.scorpionfly.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {
        this.scorpionfly.render(0.01f);
    }

    public void renderStaticFloor(float f) {
        this.scorpionfly.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {
        this.scorpionfly.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.scorpionfly.offsetY = -2.8F;
        this.scorpionfly.offsetX = 1.2F;
        this.scorpionfly.rotateAngleY = (float)Math.toRadians(230);
        this.scorpionfly.rotateAngleX = (float)Math.toRadians(10);
        this.scorpionfly.rotateAngleZ = (float)Math.toRadians(0);
        this.scorpionfly.scaleChildren = true;
        float scaler = 4.23F;
        this.scorpionfly.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.scorpionfly.render(f);
        //Reset rotations, positions and sizing:
        this.scorpionfly.setScale(1.0F, 1.0F, 1.0F);
        this.scorpionfly.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraFortiholcorpa ee = (EntityPrehistoricFloraFortiholcorpa) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

               
            }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFortiholcorpa entity = (EntityPrehistoricFloraFortiholcorpa) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(scorpionfly, scorpionfly.rotateAngleX + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2-60))*7), scorpionfly.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*5), scorpionfly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+60))*10));
        this.scorpionfly.rotationPointX = this.scorpionfly.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375+100))*2);
        this.scorpionfly.rotationPointY = this.scorpionfly.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2))*0.5);
        this.scorpionfly.rotationPointZ = this.scorpionfly.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*2250))*0.3);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 11.46118 + (((tickAnim - 0) / 1) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 0) / 1) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 0) / 1) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 39.30804 + (((tickAnim - 1) / 1) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 1) / 1) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 1) / 1) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 3.49375 + (((tickAnim - 2) / 0) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 2) / 0) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 2) / 0) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -38.45348 + (((tickAnim - 2) / 1) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 2) / 1) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 2) / 1) * (90.67227-(1.01554)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 11.46118 + (((tickAnim - 3) / 1) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 3) / 1) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 3) / 1) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 39.30804 + (((tickAnim - 4) / 1) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 4) / 1) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 4) / 1) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 3.49375 + (((tickAnim - 5) / 1) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 5) / 1) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 5) / 1) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -38.45348 + (((tickAnim - 6) / 0) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 6) / 0) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 6) / 0) * (90.67227-(1.01554)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 11.46118 + (((tickAnim - 6) / 1) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 6) / 1) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 6) / 1) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 39.30804 + (((tickAnim - 7) / 1) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 7) / 1) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 7) / 1) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 3.49375 + (((tickAnim - 8) / 1) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 8) / 1) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 8) / 1) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -38.45348 + (((tickAnim - 9) / 1) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 9) / 1) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 9) / 1) * (90.67227-(1.01554)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 11.46118 + (((tickAnim - 10) / 0) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 10) / 0) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 10) / 0) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 39.30804 + (((tickAnim - 10) / 1) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 10) / 1) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 10) / 1) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 3.49375 + (((tickAnim - 11) / 1) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 11) / 1) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 11) / 1) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -38.45348 + (((tickAnim - 12) / 1) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 12) / 1) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 12) / 1) * (90.67227-(1.01554)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.46118 + (((tickAnim - 13) / 1) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 13) / 1) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 13) / 1) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 39.30804 + (((tickAnim - 14) / 0) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 14) / 0) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 14) / 0) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 3.49375 + (((tickAnim - 14) / 1) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 14) / 1) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 14) / 1) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -38.45348 + (((tickAnim - 15) / 1) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 15) / 1) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 15) / 1) * (90.67227-(1.01554)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 11.46118 + (((tickAnim - 16) / 1) * (39.30804-(11.46118)));
            yy = -71.86858 + (((tickAnim - 16) / 1) * (-54.49711-(-71.86858)));
            zz = 90.67227 + (((tickAnim - 16) / 1) * (10.73808-(90.67227)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 39.30804 + (((tickAnim - 17) / 1) * (3.49375-(39.30804)));
            yy = -54.49711 + (((tickAnim - 17) / 1) * (-41.42081-(-54.49711)));
            zz = 10.73808 + (((tickAnim - 17) / 1) * (-78.41579-(10.73808)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 3.49375 + (((tickAnim - 18) / 0) * (-38.45348-(3.49375)));
            yy = -41.42081 + (((tickAnim - 18) / 0) * (-34.43332-(-41.42081)));
            zz = -78.41579 + (((tickAnim - 18) / 0) * (1.01554-(-78.41579)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -38.45348 + (((tickAnim - 18) / 1) * (11.46118-(-38.45348)));
            yy = -34.43332 + (((tickAnim - 18) / 1) * (-71.86858-(-34.43332)));
            zz = 1.01554 + (((tickAnim - 18) / 1) * (90.67227-(1.01554)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -21.62056 + (((tickAnim - 0) / 1) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 0) / 1) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 0) / 1) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 65.71163 + (((tickAnim - 1) / 1) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 1) / 1) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 1) / 1) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 26.29177 + (((tickAnim - 2) / 0) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 2) / 0) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 2) / 0) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -31.30104 + (((tickAnim - 2) / 1) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 2) / 1) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 2) / 1) * (94.9464-(42.58748)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.62056 + (((tickAnim - 3) / 1) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 3) / 1) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 3) / 1) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 65.71163 + (((tickAnim - 4) / 1) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 4) / 1) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 4) / 1) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 26.29177 + (((tickAnim - 5) / 1) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 5) / 1) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 5) / 1) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -31.30104 + (((tickAnim - 6) / 0) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 6) / 0) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 6) / 0) * (94.9464-(42.58748)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -21.62056 + (((tickAnim - 6) / 1) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 6) / 1) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 6) / 1) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 65.71163 + (((tickAnim - 7) / 1) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 7) / 1) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 7) / 1) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 26.29177 + (((tickAnim - 8) / 1) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 8) / 1) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 8) / 1) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -31.30104 + (((tickAnim - 9) / 1) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 9) / 1) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 9) / 1) * (94.9464-(42.58748)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -21.62056 + (((tickAnim - 10) / 0) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 10) / 0) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 10) / 0) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 65.71163 + (((tickAnim - 10) / 1) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 10) / 1) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 10) / 1) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 26.29177 + (((tickAnim - 11) / 1) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 11) / 1) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 11) / 1) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -31.30104 + (((tickAnim - 12) / 1) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 12) / 1) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 12) / 1) * (94.9464-(42.58748)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.62056 + (((tickAnim - 13) / 1) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 13) / 1) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 13) / 1) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 65.71163 + (((tickAnim - 14) / 0) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 14) / 0) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 14) / 0) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 26.29177 + (((tickAnim - 14) / 1) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 14) / 1) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 14) / 1) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -31.30104 + (((tickAnim - 15) / 1) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 15) / 1) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 15) / 1) * (94.9464-(42.58748)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -21.62056 + (((tickAnim - 16) / 1) * (65.71163-(-21.62056)));
            yy = -83.22246 + (((tickAnim - 16) / 1) * (-65.37646-(-83.22246)));
            zz = 94.9464 + (((tickAnim - 16) / 1) * (-9.24803-(94.9464)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 65.71163 + (((tickAnim - 17) / 1) * (26.29177-(65.71163)));
            yy = -65.37646 + (((tickAnim - 17) / 1) * (-53.50937-(-65.37646)));
            zz = -9.24803 + (((tickAnim - 17) / 1) * (-81.47021-(-9.24803)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 26.29177 + (((tickAnim - 18) / 0) * (-31.30104-(26.29177)));
            yy = -53.50937 + (((tickAnim - 18) / 0) * (-76.93098-(-53.50937)));
            zz = -81.47021 + (((tickAnim - 18) / 0) * (42.58748-(-81.47021)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -31.30104 + (((tickAnim - 18) / 1) * (-21.62056-(-31.30104)));
            yy = -76.93098 + (((tickAnim - 18) / 1) * (-83.22246-(-76.93098)));
            zz = 42.58748 + (((tickAnim - 18) / 1) * (94.9464-(42.58748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -21.62056 + (((tickAnim - 0) / 1) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 0) / 1) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 0) / 1) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 65.71163 + (((tickAnim - 1) / 1) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 1) / 1) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 1) / 1) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 26.29177 + (((tickAnim - 2) / 0) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 2) / 0) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 2) / 0) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -31.30104 + (((tickAnim - 2) / 1) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 2) / 1) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 2) / 1) * (-94.9464-(-42.58748)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.62056 + (((tickAnim - 3) / 1) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 3) / 1) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 3) / 1) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 65.71163 + (((tickAnim - 4) / 1) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 4) / 1) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 4) / 1) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 26.29177 + (((tickAnim - 5) / 1) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 5) / 1) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 5) / 1) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -31.30104 + (((tickAnim - 6) / 0) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 6) / 0) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 6) / 0) * (-94.9464-(-42.58748)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -21.62056 + (((tickAnim - 6) / 1) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 6) / 1) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 6) / 1) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 65.71163 + (((tickAnim - 7) / 1) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 7) / 1) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 7) / 1) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 26.29177 + (((tickAnim - 8) / 1) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 8) / 1) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 8) / 1) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -31.30104 + (((tickAnim - 9) / 1) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 9) / 1) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 9) / 1) * (-94.9464-(-42.58748)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -21.62056 + (((tickAnim - 10) / 0) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 10) / 0) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 10) / 0) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 65.71163 + (((tickAnim - 10) / 1) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 10) / 1) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 10) / 1) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 26.29177 + (((tickAnim - 11) / 1) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 11) / 1) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 11) / 1) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -31.30104 + (((tickAnim - 12) / 1) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 12) / 1) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 12) / 1) * (-94.9464-(-42.58748)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.62056 + (((tickAnim - 13) / 1) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 13) / 1) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 13) / 1) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 65.71163 + (((tickAnim - 14) / 0) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 14) / 0) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 14) / 0) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 26.29177 + (((tickAnim - 14) / 1) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 14) / 1) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 14) / 1) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -31.30104 + (((tickAnim - 15) / 1) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 15) / 1) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 15) / 1) * (-94.9464-(-42.58748)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -21.62056 + (((tickAnim - 16) / 1) * (65.71163-(-21.62056)));
            yy = 83.22246 + (((tickAnim - 16) / 1) * (65.37646-(83.22246)));
            zz = -94.9464 + (((tickAnim - 16) / 1) * (9.24803-(-94.9464)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 65.71163 + (((tickAnim - 17) / 1) * (26.29177-(65.71163)));
            yy = 65.37646 + (((tickAnim - 17) / 1) * (53.50937-(65.37646)));
            zz = 9.24803 + (((tickAnim - 17) / 1) * (81.47021-(9.24803)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 26.29177 + (((tickAnim - 18) / 0) * (-31.30104-(26.29177)));
            yy = 53.50937 + (((tickAnim - 18) / 0) * (76.93098-(53.50937)));
            zz = 81.47021 + (((tickAnim - 18) / 0) * (-42.58748-(81.47021)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -31.30104 + (((tickAnim - 18) / 1) * (-21.62056-(-31.30104)));
            yy = 76.93098 + (((tickAnim - 18) / 1) * (83.22246-(76.93098)));
            zz = -42.58748 + (((tickAnim - 18) / 1) * (-94.9464-(-42.58748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 11.46118 + (((tickAnim - 0) / 1) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 0) / 1) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 0) / 1) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 39.30804 + (((tickAnim - 1) / 1) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 1) / 1) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 1) / 1) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 3.49375 + (((tickAnim - 2) / 0) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 2) / 0) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 2) / 0) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -38.45348 + (((tickAnim - 2) / 1) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 2) / 1) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 2) / 1) * (-90.67227-(-1.01554)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 11.46118 + (((tickAnim - 3) / 1) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 3) / 1) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 3) / 1) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 39.30804 + (((tickAnim - 4) / 1) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 4) / 1) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 4) / 1) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 3.49375 + (((tickAnim - 5) / 1) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 5) / 1) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 5) / 1) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -38.45348 + (((tickAnim - 6) / 0) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 6) / 0) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 6) / 0) * (-90.67227-(-1.01554)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 11.46118 + (((tickAnim - 6) / 1) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 6) / 1) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 6) / 1) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 39.30804 + (((tickAnim - 7) / 1) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 7) / 1) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 7) / 1) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 3.49375 + (((tickAnim - 8) / 1) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 8) / 1) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 8) / 1) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -38.45348 + (((tickAnim - 9) / 1) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 9) / 1) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 9) / 1) * (-90.67227-(-1.01554)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 11.46118 + (((tickAnim - 10) / 0) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 10) / 0) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 10) / 0) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 39.30804 + (((tickAnim - 10) / 1) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 10) / 1) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 10) / 1) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 3.49375 + (((tickAnim - 11) / 1) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 11) / 1) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 11) / 1) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -38.45348 + (((tickAnim - 12) / 1) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 12) / 1) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 12) / 1) * (-90.67227-(-1.01554)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.46118 + (((tickAnim - 13) / 1) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 13) / 1) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 13) / 1) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 39.30804 + (((tickAnim - 14) / 0) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 14) / 0) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 14) / 0) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 3.49375 + (((tickAnim - 14) / 1) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 14) / 1) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 14) / 1) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -38.45348 + (((tickAnim - 15) / 1) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 15) / 1) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 15) / 1) * (-90.67227-(-1.01554)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 11.46118 + (((tickAnim - 16) / 1) * (39.30804-(11.46118)));
            yy = 71.86858 + (((tickAnim - 16) / 1) * (54.49711-(71.86858)));
            zz = -90.67227 + (((tickAnim - 16) / 1) * (-10.73808-(-90.67227)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 39.30804 + (((tickAnim - 17) / 1) * (3.49375-(39.30804)));
            yy = 54.49711 + (((tickAnim - 17) / 1) * (41.42081-(54.49711)));
            zz = -10.73808 + (((tickAnim - 17) / 1) * (78.41579-(-10.73808)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 3.49375 + (((tickAnim - 18) / 0) * (-38.45348-(3.49375)));
            yy = 41.42081 + (((tickAnim - 18) / 0) * (34.43332-(41.42081)));
            zz = 78.41579 + (((tickAnim - 18) / 0) * (-1.01554-(78.41579)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -38.45348 + (((tickAnim - 18) / 1) * (11.46118-(-38.45348)));
            yy = 34.43332 + (((tickAnim - 18) / 1) * (71.86858-(34.43332)));
            zz = -1.01554 + (((tickAnim - 18) / 1) * (-90.67227-(-1.01554)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-70), rightLeg1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*10), rightLeg1.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*10));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(10), rightLeg2.rotateAngleY + (float) Math.toRadians(-100), rightLeg2.rotateAngleZ + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*10));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(10), rightLeg3.rotateAngleZ + (float) Math.toRadians(-10));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-70), leftLeg1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375))*10), leftLeg1.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375))*10));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(10), leftLeg2.rotateAngleY + (float) Math.toRadians(100), leftLeg2.rotateAngleZ + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-20))*10));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-40))*10), leftLeg3.rotateAngleY + (float) Math.toRadians(-10), leftLeg3.rotateAngleZ + (float) Math.toRadians(10));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-40))*15), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375+60))*15), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2-60*2))*2), abdomen2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60))*2), abdomen2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen3, abdomen3.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2-60*3))*2), abdomen3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60*2))*2), abdomen3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2-60*4))*5), abdomen4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375-60*3))*5), abdomen4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen5, abdomen5.rotateAngleX + (float) Math.toRadians(-7.5), abdomen5.rotateAngleY + (float) Math.toRadians(0), abdomen5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen6, abdomen6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375*2-60*4))*5), abdomen6.rotateAngleY + (float) Math.toRadians(0), abdomen6.rotateAngleZ + (float) Math.toRadians(0));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
