package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPentameroceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPentameroceras extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightFrontTentacle;
    private final AdvancedModelRenderer leftFrontTentacle;
    private final AdvancedModelRenderer rightBackTentacle;
    private final AdvancedModelRenderer leftBackTentacle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;

    private ModelAnimator animator;

    public ModelPentameroceras() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.0F, -7.0F, -2.0F, 6, 6, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 11, -2.5F, -12.0F, -1.0F, 5, 5, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.336F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 0, -2.0F, -1.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -12.7041F, 1.7107F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6414F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 17, -1.0F, -5.0F, -2.0F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -11.7041F, 1.8606F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6414F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -2.0F, -5.0F, -2.0F, 3, 5, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.8904F, 3.4651F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2313F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 11, -2.0F, -7.0F, -2.0F, 4, 7, 2, -0.04F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9891F, 2.5823F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2225F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 21, -2.0F, -4.0F, -2.0F, 4, 4, 2, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 28, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -9.7743F, -1.9802F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0567F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 10, -2.0F, -4.0F, 0.0F, 3, 4, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.944F, -3.133F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2923F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -2.0F, -5.0F, 0.0F, 4, 5, 2, -0.04F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.9478F, -3.3075F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 21, -2.0F, -4.0F, 0.0F, 4, 4, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2611F, -2.2329F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 5, -2.0F, -2.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(mantle);


        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.25F, 2.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.7418F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 24, 28, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightFrontTentacle = new AdvancedModelRenderer(this);
        this.rightFrontTentacle.setRotationPoint(-1.5F, -1.0F, -1.75F);
        this.mantle.addChild(rightFrontTentacle);
        this.setRotateAngle(rightFrontTentacle, -0.413F, 0.1451F, 0.4932F);
        this.rightFrontTentacle.cubeList.add(new ModelBox(rightFrontTentacle, 29, 28, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.rightFrontTentacle.cubeList.add(new ModelBox(rightFrontTentacle, 19, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftFrontTentacle = new AdvancedModelRenderer(this);
        this.leftFrontTentacle.setRotationPoint(1.5F, -1.0F, -1.75F);
        this.mantle.addChild(leftFrontTentacle);
        this.setRotateAngle(leftFrontTentacle, -0.413F, -0.1451F, -0.4932F);
        this.leftFrontTentacle.cubeList.add(new ModelBox(leftFrontTentacle, 29, 28, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.leftFrontTentacle.cubeList.add(new ModelBox(leftFrontTentacle, 19, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.rightBackTentacle = new AdvancedModelRenderer(this);
        this.rightBackTentacle.setRotationPoint(-1.5F, -0.75F, 0.0F);
        this.mantle.addChild(rightBackTentacle);
        this.setRotateAngle(rightBackTentacle, 0.2995F, -0.2117F, 0.5306F);
        this.rightBackTentacle.cubeList.add(new ModelBox(rightBackTentacle, 11, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.rightBackTentacle.cubeList.add(new ModelBox(rightBackTentacle, 22, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftBackTentacle = new AdvancedModelRenderer(this);
        this.leftBackTentacle.setRotationPoint(1.5F, -0.75F, 0.0F);
        this.mantle.addChild(leftBackTentacle);
        this.setRotateAngle(leftBackTentacle, 0.2995F, 0.2117F, -0.5306F);
        this.leftBackTentacle.cubeList.add(new ModelBox(leftBackTentacle, 11, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.leftBackTentacle.cubeList.add(new ModelBox(leftBackTentacle, 22, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-0.3903F, -1.9672F, -2.9314F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, -1.1634F, 0.5293F, 0.2145F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 16, 32, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.3903F, -1.9672F, -2.9314F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, -1.1634F, -0.5293F, -0.2145F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 16, 32, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));
        
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
        this.base.offsetY = -1.4F;
        this.base.offsetX = -0.2F;
        this.base.rotateAngleY = (float)Math.toRadians(242);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 3.3F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
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
        EntityPrehistoricFloraPentameroceras ee = (EntityPrehistoricFloraPentameroceras) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPentameroceras entity = (EntityPrehistoricFloraPentameroceras) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+20))*20), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100))*-0.2),(float)(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-150))*-0.4));
        this.setRotateAngle(rightEye, rightEye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+160))*20), rightEye.rotateAngleY + (float) Math.toRadians(0), rightEye.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+50))*10));
        this.setRotateAngle(leftEye, leftEye.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+200))*20), leftEye.rotateAngleY + (float) Math.toRadians(0), leftEye.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130+80))*10));
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+120+50))*20), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+190+90))*2), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+130-70))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+30))*0.1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(5.4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+150+150))*3);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(-0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100+70))*4);
        this.setRotateAngle(rightFrontTentacle, rightFrontTentacle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+100))*20), rightFrontTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), rightFrontTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.rightFrontTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);
        this.setRotateAngle(leftFrontTentacle, leftFrontTentacle.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+150))*20), leftFrontTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), leftFrontTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.leftFrontTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);
        this.setRotateAngle(rightBackTentacle, rightBackTentacle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*20), rightBackTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), rightBackTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.rightBackTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);
        this.setRotateAngle(leftBackTentacle, leftBackTentacle.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+120))*20), leftBackTentacle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+70))*2), leftBackTentacle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25+50))*4));
        this.leftBackTentacle.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/0.25-60))*-0.1),(float)1);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraPentameroceras ee = (EntityPrehistoricFloraPentameroceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetX = -0.5f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

