package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimeroceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTrimeroceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightTentacle;
    private final AdvancedModelRenderer leftTentacle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;

    private ModelAnimator animator;

    public ModelTrimeroceras() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.0F, -9.0F, -2.0F, 6, 7, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 28, -1.5F, -13.7785F, -0.5139F, 3, 3, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 13, 26, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 13, 20, -2.5F, -12.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.336F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -2.0F, -4.0F, 0.0F, 4, 4, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.1929F, -0.5393F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.0036F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 18, -1.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -9.7579F, -2.848F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 12, -3.0F, -5.0F, 0.0F, 4, 5, 2, -0.04F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.7764F, -3.3188F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -2.0F, -6.0F, 0.0F, 4, 6, 2, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, -2.0F, -2.0F, 0.0F, 4, 2, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.7785F, 1.4861F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.781F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 31, -1.0F, -2.0F, -1.0F, 2, 3, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -9.9082F, 2.1946F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3622F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 13, -3.0F, -2.0F, -2.0F, 4, 2, 2, -0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.969F, 2.8892F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 6, -2.0F, -4.0F, -2.0F, 4, 4, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0268F, 2.2118F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 26, -2.0F, -4.0F, -1.0F, 4, 4, 1, -0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(mantle);


        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.7418F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 21, 6, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightTentacle = new AdvancedModelRenderer(this);
        this.rightTentacle.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.mantle.addChild(rightTentacle);
        this.setRotateAngle(rightTentacle, -0.4363F, 0.0F, 0.1745F);
        this.rightTentacle.cubeList.add(new ModelBox(rightTentacle, 18, 31, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.rightTentacle.cubeList.add(new ModelBox(rightTentacle, 28, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftTentacle = new AdvancedModelRenderer(this);
        this.leftTentacle.setRotationPoint(0.5F, -0.5F, -1.0F);
        this.mantle.addChild(leftTentacle);
        this.setRotateAngle(leftTentacle, -0.4363F, 0.0F, -0.1745F);
        this.leftTentacle.cubeList.add(new ModelBox(leftTentacle, 18, 31, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.leftTentacle.cubeList.add(new ModelBox(leftTentacle, 28, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.5F, -0.5F, -1.0F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, -0.4765F, 0.0603F, 0.7707F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 23, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.5F, -0.5F, -1.0F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, -0.4765F, -0.0603F, -0.7707F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 23, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        
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
        this.base.offsetX = 0.2F;
        this.base.rotateAngleY = (float)Math.toRadians(242);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.23F;
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
        EntityPrehistoricFloraTrimeroceras ee = (EntityPrehistoricFloraTrimeroceras) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrimeroceras entity = (EntityPrehistoricFloraTrimeroceras) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+120+50))*20), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+90))*2), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130-70))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+30))*0.1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(5.4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+150+150))*3);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(-0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+70))*4);
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+20))*20), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100))*-0.2),(float)(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-150))*-0.4));
        this.setRotateAngle(rightTentacle, rightTentacle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100))*20), rightTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), rightTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.rightTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);
        this.setRotateAngle(leftTentacle, leftTentacle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+150))*20), leftTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), leftTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.leftTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);
        this.setRotateAngle(rightEye, rightEye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+160))*20), rightEye.rotateAngleY + (float) Math.toRadians(0), rightEye.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+50))*10));
        this.setRotateAngle(leftEye, leftEye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+200))*20), leftEye.rotateAngleY + (float) Math.toRadians(0), leftEye.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+80))*10));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraTrimeroceras ee = (EntityPrehistoricFloraTrimeroceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetX = -0.5f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

