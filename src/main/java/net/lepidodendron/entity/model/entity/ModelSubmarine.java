package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.IMultipassModel;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSubmarine extends AdvancedModelBase implements IMultipassModel {

    private final AdvancedModelRenderer submarine;
    private final AdvancedModelRenderer Cockpitmetal;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cockpit;
    private final AdvancedModelRenderer Cockpitinside;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer Arm;
    private final AdvancedModelRenderer Arm2;
    private final AdvancedModelRenderer Arm3;
    private final AdvancedModelRenderer Arm4;
    private final AdvancedModelRenderer Hand;
    private final AdvancedModelRenderer Handanimated;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Handanimated2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightTurbine;
    private final AdvancedModelRenderer leftTurbine;
    private final AdvancedModelRenderer leftTurbine2;
    private final AdvancedModelRenderer rightTurbine2;
    private final AdvancedModelRenderer leftWing;
    public ModelRenderer nowaterCockpit;

    private ModelAnimator animator;

    public ModelSubmarine() {
        this.textureWidth = 380;
        this.textureHeight = 380;

        this.nowaterCockpit = new AdvancedModelRenderer(this);
        this.nowaterCockpit.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.nowaterCockpit.cubeList.add(new ModelBox(nowaterCockpit, 0, 274, -19.0F, -43.0F, -7.0F, 36, 36, 36, 0.0F, false));

        this.submarine = new AdvancedModelRenderer(this);
        this.submarine.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Cockpitmetal = new AdvancedModelRenderer(this);
        this.Cockpitmetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.submarine.addChild(Cockpitmetal);
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 144, 215, -19.0F, -7.0F, -7.0F, 36, 3, 36, 0.003F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 109, 0, -13.0F, -46.0F, 1.0F, 24, 3, 20, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 109, 67, -13.0F, -49.0F, 1.0F, 24, 3, 1, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 135, 145, -5.0F, -47.0F, 7.0F, 8, 1, 8, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 109, 23, 5.0F, -49.0F, 7.0F, 4, 3, 20, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 34, 100, -11.0F, -49.0F, 7.0F, 4, 3, 20, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-9.0F, -47.5F, 27.0F);
        this.Cockpitmetal.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 109, 131, -2.0F, -1.3F, -0.9F, 4, 5, 13, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 134, 118, 14.0F, -1.3F, -0.9F, 4, 5, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-9.0F, -40.6676F, 37.1215F);
        this.Cockpitmetal.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 123, -2.0F, -1.0913F, -0.1099F, 4, 7, 13, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 130, 14.0F, -1.0913F, -0.1099F, 4, 7, 13, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(10.5F, -45.5F, 13.0F);
        this.Cockpitmetal.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 147, 59, -23.5F, -0.5F, -11.5F, 1, 3, 12, -0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 149, -0.5F, -0.5F, -11.5F, 1, 3, 12, -0.003F, false));

        this.cockpit = new AdvancedModelRenderer(this);
        this.cockpit.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cockpitmetal.addChild(cockpit);
        this.cockpit.cubeList.add(new ModelBox(cockpit, 0, 200, -19.0F, -43.0F, -7.0F, 36, 36, 36, 0.0F, false));

        this.Cockpitinside = new AdvancedModelRenderer(this);
        this.Cockpitinside.setRotationPoint(0.0F, -19.0F, 28.0F);
        this.Cockpitmetal.addChild(Cockpitinside);
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 0, 100, -9.0F, 4.0F, -30.0F, 16, 8, 11, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 0, 52, -9.0F, 4.0F, -13.0F, 16, 8, 11, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 46, 26, -9.0F, -5.0F, -19.0F, 16, 18, 2, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 46, 0, -9.0F, -5.0F, -2.0F, 16, 18, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(7.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 109, 23, 1.0F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-9.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3927F, 0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 109, 32, -8.0F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -22.0F, -31.5F);
        this.Cockpitinside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.1345F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 52, -2.0F, -7.9218F, 0.1069F, 4, 8, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 143, 136, -8.0F, -4.0F, -0.5F, 16, 8, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -31.0F, 29.0F);
        this.submarine.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 206, 66, -19.0F, -2.0F, -1.0F, 36, 3, 29, -0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 254, 186, -15.0F, 1.0F, -1.0F, 28, 9, 29, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 119, -12.0F, -5.0F, 5.0F, 6, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 137, 46, -7.0F, -11.0F, 2.0F, 12, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 43, 52, -7.0F, -17.0F, -8.0F, 12, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 109, 115, 4.0F, -5.0F, 5.0F, 6, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 135, -5.0F, -8.0F, 7.0F, 8, 6, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 115, 254, -20.0F, 10.0F, -1.0F, 38, 17, 29, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 249, 254, -17.0F, 27.0F, -1.0F, 32, 7, 25, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 71, -15.0F, 27.0F, -41.0F, 28, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 62, 110, -19.0F, 24.0F, -41.0F, 4, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 109, 46, 13.0F, 24.0F, -41.0F, 4, 7, 3, 0.0F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-20.0F, 0.0F, 0.0F);
        this.body.addChild(rightWing);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 137, 23, -8.0F, -2.0F, -8.0F, 13, 6, 6, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 28, 160, 0.0F, -2.0F, -2.0F, 5, 6, 6, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -8.0F, -2.0F, 4.0F, 13, 6, 20, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 100, -12.0F, 10.0F, -56.0F, 13, 17, 83, -0.004F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 206, 115, -10.0F, 28.0F, -39.0F, 8, 6, 60, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 156, -11.0F, 27.0F, -23.0F, 10, 8, 4, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 155, 115, -11.0F, 27.0F, 1.0F, 10, 8, 4, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 115, 123, -19.0F, 12.0F, -50.0F, 7, 15, 77, 0.0F, false));

        this.Arm = new AdvancedModelRenderer(this);
        this.Arm.setRotationPoint(1.0F, 18.0F, -44.0F);
        this.rightWing.addChild(Arm);
        this.Arm.cubeList.add(new ModelBox(Arm, 24, 143, 0.0F, -2.0F, -9.0F, 2, 7, 10, 0.0F, false));
        this.Arm.cubeList.add(new ModelBox(Arm, 43, 100, 2.0F, 0.8F, -5.0F, 1, 2, 3, 0.0F, false));

        this.Arm2 = new AdvancedModelRenderer(this);
        this.Arm2.setRotationPoint(2.0F, 2.0F, -5.0F);
        this.Arm.addChild(Arm2);
        this.setRotateAngle(Arm2, 0.1309F, 0.0F, 0.0F);
        this.Arm2.cubeList.add(new ModelBox(Arm2, 0, 0, -0.4F, -16.0F, -2.0F, 2, 17, 3, 0.0F, false));

        this.Arm3 = new AdvancedModelRenderer(this);
        this.Arm3.setRotationPoint(0.6F, -15.0F, -1.0F);
        this.Arm2.addChild(Arm3);
        this.setRotateAngle(Arm3, 2.618F, 0.0F, 0.0F);
        this.Arm3.cubeList.add(new ModelBox(Arm3, 10, 0, -0.5F, -14.0F, -2.0F, 1, 14, 3, -0.004F, false));

        this.Arm4 = new AdvancedModelRenderer(this);
        this.Arm4.setRotationPoint(0.0F, -13.6F, -0.3F);
        this.Arm3.addChild(Arm4);
        this.setRotateAngle(Arm4, 0.7418F, 0.0F, 0.0F);
        this.Arm4.cubeList.add(new ModelBox(Arm4, 74, 50, -0.5F, -5.7174F, -0.9877F, 1, 6, 2, 0.0F, false));

        this.Hand = new AdvancedModelRenderer(this);
        this.Hand.setRotationPoint(0.0F, -5.7F, 0.0F);
        this.Arm4.addChild(Hand);
        this.Hand.cubeList.add(new ModelBox(Hand, 72, 20, -1.0F, -1.0F, -1.6F, 2, 1, 3, 0.0F, false));

        this.Handanimated = new AdvancedModelRenderer(this);
        this.Handanimated.setRotationPoint(0.0F, -1.0F, -1.1F);
        this.Hand.addChild(Handanimated);
        this.setRotateAngle(Handanimated, -0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handanimated.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 26, -0.6F, -2.8F, -0.4F, 1, 3, 1, 0.0F, false));

        this.Handanimated2 = new AdvancedModelRenderer(this);
        this.Handanimated2.setRotationPoint(0.0F, -1.0F, 0.9F);
        this.Hand.addChild(Handanimated2);
        this.setRotateAngle(Handanimated2, 0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handanimated2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, -0.6F, -2.8F, -0.6F, 1, 3, 1, 0.0F, false));

        this.rightTurbine = new AdvancedModelRenderer(this);
        this.rightTurbine.setRotationPoint(0.0F, 7.0F, 24.0F);
        this.rightWing.addChild(rightTurbine);
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 62, 100, -2.0F, -3.0F, -3.0F, 6, 6, 4, 0.0F, false));
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 0, 100, 4.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 159, 145, 0.0F, -1.0F, -7.0F, 2, 2, 9, 0.0F, false));

        this.leftTurbine = new AdvancedModelRenderer(this);
        this.leftTurbine.setRotationPoint(38.0F, 7.0F, 24.0F);
        this.rightWing.addChild(leftTurbine);
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 62, 73, -4.0F, -3.0F, -3.0F, 6, 6, 4, 0.0F, false));
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 66, 46, -5.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 157, 35, -2.0F, -1.0F, -7.0F, 2, 2, 9, 0.0F, false));

        this.leftTurbine2 = new AdvancedModelRenderer(this);
        this.leftTurbine2.setRotationPoint(44.0F, -1.0F, 1.0F);
        this.rightWing.addChild(leftTurbine2);
        this.setRotateAngle(leftTurbine2, 1.5708F, 0.0F, -0.4363F);
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 0, 36, -4.0F, -3.0F, -3.0F, 6, 6, 4, 0.0F, false));
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 66, 20, -5.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 109, 9, -2.0F, -1.0F, -5.0F, 2, 2, 7, 0.0F, false));

        this.rightTurbine2 = new AdvancedModelRenderer(this);
        this.rightTurbine2.setRotationPoint(-4.0F, -1.0F, 1.0F);
        this.rightWing.addChild(rightTurbine2);
        this.setRotateAngle(rightTurbine2, 1.5708F, 0.0F, 0.4363F);
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 0, 26, -2.0F, -3.0F, -3.0F, 6, 6, 4, 0.0F, false));
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 54, 61, 4.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 109, 0, 0.0F, -1.0F, -5.0F, 2, 2, 7, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(18.0F, 0.0F, 0.0F);
        this.body.addChild(leftWing);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 109, 71, -5.0F, -2.0F, -8.0F, 13, 6, 6, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 59, 61, -5.0F, -2.0F, -2.0F, 6, 6, 6, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 26, -5.0F, -2.0F, 4.0F, 13, 6, 20, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, -1.0F, 10.0F, -56.0F, 13, 17, 83, -0.004F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 109, 46, -8.0F, 19.0F, -55.0F, 7, 7, 14, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 154, 157, -4.0F, 15.0F, -53.0F, 3, 3, 9, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 206, 0, 2.0F, 28.0F, -39.0F, 8, 6, 60, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 135, 154, 1.0F, 27.0F, -23.0F, 10, 8, 4, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 48, 150, 1.0F, 27.0F, 1.0F, 10, 8, 4, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 115, 23, 12.0F, 12.0F, -50.0F, 7, 15, 77, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.submarine.offsetZ = -0.45F;
        this.submarine.render(f5);
    }
    
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    public void renderMultipass(Entity entityIn, float partialTicks, float p_187054_3_, float p_187054_4_, float p_187054_5_, float p_187054_6_, float scale)
    {
        //GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
        //GlStateManager.colorMask(false, false, false, false);
        //this.nowaterCockpit.render(scale);
        //GlStateManager.colorMask(true, true, true, true);

        //GlStateManager.colorMask(false, false, false, false);
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        //GlStateManager.color(1.0F, 1.0F, 1.0F, 0.2F);
        //this.nowaterCockpit.render(scale);
        //GlStateManager.disableBlend();
        //GlStateManager.colorMask(true, true, true, true);
    }

}

