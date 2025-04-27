package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPravitoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPravitoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle1d;
    private final AdvancedModelRenderer tentacl6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle6d;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer shell13;
    private final AdvancedModelRenderer shell14;
    private final AdvancedModelRenderer shell15;
    private final AdvancedModelRenderer shell16;

    private ModelAnimator animator;

    public ModelPravitoceras() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -22.5F, -2.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, 1.0908F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 24, -2.0F, 13.303F, -15.0849F, 4, 4, 10, 0.02F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 13.553F, -5.0849F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.5236F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 53, 61, -1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-0.1F, 3.0F, 11.0F);
        this.mantle.addChild(rightEye);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 11, 62, -1.9F, -2.5F, -9.5F, 1, 2, 2, 0.0F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 63, 56, -2.0F, -2.0F, -9.0F, 1, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.1F, 3.0F, 11.0F);
        this.mantle.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 11, 62, 0.9F, -2.5F, -9.5F, 1, 2, 2, 0.0F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 63, 56, 1.0F, -2.0F, -9.0F, 1, 1, 1, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 2.2544F, 1.8967F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.6545F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 11, 67, -0.5F, -0.3154F, 0.4021F, 1, 1, 2, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.5679F, -0.0442F, 0.0282F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 52, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, 0.0873F, -0.1745F, 0.0F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 68, 56, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, 0.0F, -0.1745F, 0.0F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 21, 39, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tentacle1d = new AdvancedModelRenderer(this);
        this.tentacle1d.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tentacle1c.addChild(tentacle1d);
        this.setRotateAngle(tentacle1d, 0.0F, 0.2182F, 0.0F);
        this.tentacle1d.cubeList.add(new ModelBox(tentacle1d, 21, 44, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tentacl6a = new AdvancedModelRenderer(this);
        this.tentacl6a.setRotationPoint(0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacl6a);
        this.setRotateAngle(tentacl6a, -0.5679F, 0.0442F, -0.0282F);
        this.tentacl6a.cubeList.add(new ModelBox(tentacl6a, 52, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacl6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, 0.0873F, 0.1745F, 0.0F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 68, 56, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, 0.0F, 0.1745F, 0.0F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 21, 39, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.tentacle6d = new AdvancedModelRenderer(this);
        this.tentacle6d.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tentacle6c.addChild(tentacle6d);
        this.setRotateAngle(tentacle6d, 0.0F, -0.2182F, 0.0F);
        this.tentacle6d.cubeList.add(new ModelBox(tentacle6d, 21, 44, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.2242F, -0.3469F, -0.7653F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.2242F, 0.3469F, 0.7653F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle3);
        this.setRotateAngle(tentacle3, -0.3491F, 0.0F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 63, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.3491F, 0.0F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 63, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle4);
        this.setRotateAngle(tentacle4, -0.1795F, -0.1639F, -0.7252F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 63, 50, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.1795F, 0.1639F, 0.7252F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 63, 50, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle5);
        this.setRotateAngle(tentacle5, -0.2618F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 68, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.2618F, 0.0F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 68, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 17.303F, -15.0849F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.9076F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 29, 26, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.9294F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 29, 38, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.7418F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 48, 0, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.9163F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 21, 50, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.02F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.4363F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 42, 50, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.04F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.6981F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 39, -1.5F, 0.0F, -7.0F, 3, 4, 7, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, 0.6981F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 25, 0, -1.5F, 0.0F, -8.0F, 3, 4, 8, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, 0.6981F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 29, 13, -1.5F, 0.0F, -8.0F, 3, 4, 8, -0.02F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, 0.8727F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 51, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.02F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, 0.6981F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 52, 11, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.01F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, 0.7418F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 52, 22, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.0F, false));

        this.shell13 = new AdvancedModelRenderer(this);
        this.shell13.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell12.addChild(shell13);
        this.setRotateAngle(shell13, 0.9599F, 0.0F, 0.0F);
        this.shell13.cubeList.add(new ModelBox(shell13, 52, 33, -1.0F, 0.0F, -7.0F, 2, 3, 7, -0.01F, false));

        this.shell14 = new AdvancedModelRenderer(this);
        this.shell14.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell13.addChild(shell14);
        this.setRotateAngle(shell14, 0.9599F, 0.0F, 0.0F);
        this.shell14.cubeList.add(new ModelBox(shell14, 19, 61, -0.5F, 0.0F, -7.0F, 1, 3, 7, -0.02F, false));

        this.shell15 = new AdvancedModelRenderer(this);
        this.shell15.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell14.addChild(shell15);
        this.setRotateAngle(shell15, 0.9599F, 0.0F, 0.0F);
        this.shell15.cubeList.add(new ModelBox(shell15, 36, 61, -0.5F, 0.0F, -7.0F, 1, 3, 7, -0.04F, false));

        this.shell16 = new AdvancedModelRenderer(this);
        this.shell16.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell14.addChild(shell16);
        this.setRotateAngle(shell16, 0.9599F, 0.0F, 0.0F);
        this.shell16.cubeList.add(new ModelBox(shell16, 0, 0, 0.0F, 0.0F, -11.0F, 0, 11, 12, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 1.2F;
        this.base.rotateAngleY = (float)Math.toRadians(242);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.23F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPravitoceras ee = (EntityPrehistoricFloraPravitoceras) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPravitoceras entity = (EntityPrehistoricFloraPravitoceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-0.2);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-0.2);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.1);


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 10) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 10) / 18) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 28) / 22) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 50) / 30) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(xx), siphon.rotateAngleY + (float) Math.toRadians(yy), siphon.rotateAngleZ + (float) Math.toRadians(zz));

        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.1),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.2));


        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tentacle1a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.tentacle1a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle2, tentacle2.rotateAngleX + (float) Math.toRadians(0), tentacle2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tentacle2.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle2.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle7, tentacle7.rotateAngleX + (float) Math.toRadians(0), tentacle7.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tentacle7.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle7.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(0), tentacle3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tentacle3.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle3.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle8, tentacle8.rotateAngleX + (float) Math.toRadians(0), tentacle8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle8.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle8.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle4.rotateAngleY + (float) Math.toRadians(0), tentacle4.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle4.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle9, tentacle9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle9.rotateAngleY + (float) Math.toRadians(0), tentacle9.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle9.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle5, tentacle5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle5.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle5.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle10, tentacle10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle10.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle10.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacl6a, tentacl6a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tentacl6a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacl6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.tentacl6a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle1c, tentacle1c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*-10), tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*-5), tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle1d, tentacle1d.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*-10), tentacle1d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*-5), tentacle1d.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), tentacle6b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6c, tentacle6c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*-10), tentacle6c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*-5), tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6d, tentacle6d.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*-10), tentacle6d.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*-5), tentacle6d.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraPravitoceras ee = (EntityPrehistoricFloraPravitoceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(270);
            this.base.offsetY = -0.1f;
            this.base.offsetX = 0.4f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

