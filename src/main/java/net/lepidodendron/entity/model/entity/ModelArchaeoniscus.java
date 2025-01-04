package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArchaeoniscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaeright;
    private final AdvancedModelRenderer antennaeleft;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer headcarapace;
    private final AdvancedModelRenderer headcarapace2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer uropodleft;
    private final AdvancedModelRenderer uropodright;

    public ModelArchaeoniscus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 22.5F, -3.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.475F, -0.5F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -2.0F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.6F, -1.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 17, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.antennaeright = new AdvancedModelRenderer(this);
        this.antennaeright.setRotationPoint(-0.75F, 0.35F, -1.75F);
        this.bone.addChild(antennaeright);
        this.setRotateAngle(antennaeright, 0.0436F, 0.3927F, -0.3491F);
        this.antennaeright.cubeList.add(new ModelBox(antennaeright, 0, 0, -3.5F, 0.0F, -3.5F, 4, 0, 4, 0.0F, false));

        this.antennaeleft = new AdvancedModelRenderer(this);
        this.antennaeleft.setRotationPoint(0.75F, 0.35F, -1.75F);
        this.bone.addChild(antennaeleft);
        this.setRotateAngle(antennaeleft, 0.0436F, -0.3927F, 0.3491F);
        this.antennaeleft.cubeList.add(new ModelBox(antennaeleft, 0, 0, -0.5F, 0.0F, -3.5F, 4, 0, 4, 0.0F, true));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-1.0F, 0.25F, -0.25F);
        this.bone.addChild(legright1);
        this.setRotateAngle(legright1, 0.0F, -0.48F, -0.7418F);
        this.legright1.cubeList.add(new ModelBox(legright1, 16, 4, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(1.0F, 0.25F, -0.25F);
        this.bone.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0F, 0.48F, 0.7418F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 16, 4, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.headcarapace = new AdvancedModelRenderer(this);
        this.headcarapace.setRotationPoint(0.0F, -0.85F, -0.3F);
        this.bone.addChild(headcarapace);
        this.setRotateAngle(headcarapace, 0.2182F, 0.0F, -0.1745F);
        this.headcarapace.cubeList.add(new ModelBox(headcarapace, 11, 3, -3.0F, 0.0059F, -0.6459F, 3, 0, 1, 0.0F, false));
        this.headcarapace.cubeList.add(new ModelBox(headcarapace, 0, 17, -2.5F, 0.0059F, -1.6459F, 1, 0, 1, 0.0F, false));

        this.headcarapace2 = new AdvancedModelRenderer(this);
        this.headcarapace2.setRotationPoint(0.0F, -0.85F, -0.3F);
        this.bone.addChild(headcarapace2);
        this.setRotateAngle(headcarapace2, 0.2182F, 0.0F, 0.1745F);
        this.headcarapace2.cubeList.add(new ModelBox(headcarapace2, 11, 3, 0.0F, 0.0059F, -0.6459F, 3, 0, 1, 0.0F, true));
        this.headcarapace2.cubeList.add(new ModelBox(headcarapace2, 0, 17, 1.5F, 0.0059F, -1.6459F, 1, 0, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, 0.25F);
        this.bone.addChild(body);
        this.setRotateAngle(body, -0.0262F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -2.0F, -0.25F, -0.5F, 4, 1, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, 0.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 13, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, 0.75F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 13, -2.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.0F, 0.75F, 0.0F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.5236F, -0.6109F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 15, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.0F, 0.75F, 0.0F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.5236F, 0.6109F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 15, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.0F, 0.75F, 0.75F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.1745F, -0.4363F);
        this.legright3.cubeList.add(new ModelBox(legright3, 16, 0, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(2.0F, 0.75F, 0.75F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.1745F, 0.4363F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 16, 0, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 8, 4, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.25F, -0.225F, 1.25F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 8, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, -0.225F, 1.25F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 8, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-2.0F, 0.75F, 0.0F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0873F, -0.3927F);
        this.legright4.cubeList.add(new ModelBox(legright4, 10, 11, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(2.0F, 0.75F, 0.0F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.0873F, 0.3927F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 10, 11, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-2.0F, 0.75F, 0.75F);
        this.body2.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.3054F, -0.3491F);
        this.legright5.cubeList.add(new ModelBox(legright5, 8, 13, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(2.0F, 0.75F, 0.75F);
        this.body2.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0F, -0.3054F, 0.3491F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 8, 13, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-2.0F, 0.75F, 1.75F);
        this.body2.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.48F, -0.3054F);
        this.legright6.cubeList.add(new ModelBox(legright6, 8, 15, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(2.0F, 0.75F, 1.75F);
        this.body2.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, -0.48F, 0.3054F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 8, 15, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 16, 15, -1.5F, -0.225F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.3F, -0.05F, -0.25F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2618F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 8, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.3F, -0.05F, -0.25F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, -0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 8, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.5F, 0.75F, 0.25F);
        this.body3.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.8727F, -0.2618F);
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 13, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.5F, 0.75F, 0.25F);
        this.body3.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, -0.8727F, 0.2618F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 13, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-1.0F, 0.75F, 0.7F);
        this.body3.addChild(gillright);
        this.setRotateAngle(gillright, -0.3054F, -0.2618F, 0.0F);
        this.gillright.cubeList.add(new ModelBox(gillright, 0, 6, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(1.0F, 0.75F, 0.7F);
        this.body3.addChild(gillleft);
        this.setRotateAngle(gillleft, -0.3054F, 0.2618F, 0.0F);
        this.gillleft.cubeList.add(new ModelBox(gillleft, 0, 6, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-1.0F, 0.75F, 1.2F);
        this.body3.addChild(gillright2);
        this.setRotateAngle(gillright2, -0.3054F, -0.2618F, 0.0F);
        this.gillright2.cubeList.add(new ModelBox(gillright2, 0, 4, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(1.0F, 0.75F, 1.2F);
        this.body3.addChild(gillleft2);
        this.setRotateAngle(gillleft2, -0.3054F, 0.2618F, 0.0F);
        this.gillleft2.cubeList.add(new ModelBox(gillleft2, 0, 4, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-1.0F, 0.75F, 1.7F);
        this.body3.addChild(gillright3);
        this.setRotateAngle(gillright3, -0.3054F, -0.2618F, 0.0F);
        this.gillright3.cubeList.add(new ModelBox(gillright3, 0, 2, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(1.0F, 0.75F, 1.7F);
        this.body3.addChild(gillleft3);
        this.setRotateAngle(gillleft3, -0.3054F, 0.2618F, 0.0F);
        this.gillleft3.cubeList.add(new ModelBox(gillleft3, 0, 2, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(-0.05F, 0.2F, 1.9F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 4, -0.95F, -0.25F, -0.5F, 2, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.85F, -0.05F, 0.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.48F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 0, -0.05F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.75F, -0.05F, 0.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 0, -2.95F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.uropodleft = new AdvancedModelRenderer(this);
        this.uropodleft.setRotationPoint(2.3F, 0.325F, 2.05F);
        this.body4.addChild(uropodleft);
        this.setRotateAngle(uropodleft, -0.1309F, 0.1309F, 0.3054F);
        this.uropodleft.cubeList.add(new ModelBox(uropodleft, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.uropodright = new AdvancedModelRenderer(this);
        this.uropodright.setRotationPoint(-2.2F, 0.325F, 2.05F);
        this.body4.addChild(uropodright);
        this.setRotateAngle(uropodright, -0.1309F, -0.1309F, -0.3054F);
        this.uropodright.cubeList.add(new ModelBox(uropodright, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.bone.offsetY = 0.04F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -0.20F;
        this.bone.offsetX = 0.0F;
        this.bone.rotateAngleY = (float)Math.toRadians(220);
        this.bone.rotateAngleX = (float)Math.toRadians(12);
        this.bone.rotateAngleZ = (float)Math.toRadians(-2);
        this.bone.scaleChildren = true;
        float scaler = 0.6F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
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
        //this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.legleft1, this.legleft2, this.legleft3, this.legleft4, this.legleft8, this.legleft6, this.legleft7};
        AdvancedModelRenderer[] legsR = {this.legright1, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6, this.legright7};
        AdvancedModelRenderer[] bodyF = {this.body, this.body2, this.body3, this.body4};

        this.chainWave(legsL, 0.2F, 0.2F * -1, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F * -1, -3, f2, 1);

        this.swing(antennaeleft, 0.3F, -0.2F, true, 0, -0.1F, f2, 0.8F);
        this.swing(antennaeright, 0.3F, 0.2F, true, 0, 0.1F, f2, 0.8F);

        if (f3 != 0) {
            this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
        }

        this.swing(legleft1, 0.5F, -0.5F * -1, true, 0, -0.5F * -1, f2, 0.3F);
        this.swing(legright1, 0.5F, 0.5F * -1, true, 0, 0.5F * -1, f2, 0.3F);
        this.swing(legleft2, 0.5F, -0.5F * -1, true, 1.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright2, 0.5F, 0.5F * -1, true, 1.0F, 0.5F * -1, f2, 0.3F);
        this.swing(legleft3, 0.5F, -0.5F * -1, true, 2.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright3, 0.5F, 0.5F * -1, true, 2.0F, 0.5F * -1, f2, 0.3F);
        this.swing(legleft4, 0.5F, -0.5F * -1, true, 3.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright4, 0.5F, 0.5F * -1, true, 3.0F, 0.5F * -1, f2, 0.3F);
        this.swing(legleft8, 0.5F, -0.5F * -1, true, 4.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright5, 0.5F, 0.5F * -1, true, 4.0F, 0.5F * -1, f2, 0.3F);
        this.swing(legleft6, 0.5F, -0.5F * -1, true, 5.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright6, 0.5F, 0.5F * -1, true, 5.0F, 0.5F * -1, f2, 0.3F);
        this.swing(legleft7, 0.5F, -0.5F * -1, true, 6.0F, -0.5F * -1, f2, 0.3F);
        this.swing(legright7, 0.5F, 0.5F * -1, true, 6.0F, 0.5F * -1, f2, 0.3F);

    }
}
