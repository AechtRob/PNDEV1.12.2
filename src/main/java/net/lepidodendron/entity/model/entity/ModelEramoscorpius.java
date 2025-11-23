package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEramoscorpius;
import net.lepidodendron.entity.EntityPrehistoricFloraPraearcturus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEramoscorpius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer carapace_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer carapace_r2;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer baby5;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer baby4;
    private final AdvancedModelRenderer baby3;
    private final AdvancedModelRenderer baby2;
    private final AdvancedModelRenderer baby1;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR2_r1;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armR3_r1;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;

    public ModelEramoscorpius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 15, 20, -1.5F, -3.0F, -7.25F, 3, 2, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 25, -2.5F, -3.0F, -3.0F, 5, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 0.0F, -7.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 5, -1.0F, -3.0F, -0.25F, 1, 1, 1, 0.0F, true));

        this.carapace_r1 = new AdvancedModelRenderer(this);
        this.carapace_r1.setRotationPoint(1.5F, 0.0F, -7.25F);
        this.body.addChild(carapace_r1);
        this.setRotateAngle(carapace_r1, 0.0F, 0.2269F, 0.0F);
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 0, 24, -1.9F, -3.0F, 0.5F, 2, 2, 5, -0.015F, true));
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 9, 24, -1.9F, -3.0F, 0.0F, 2, 2, 1, -0.02F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.0F, -7.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 5, 0.0F, -3.0F, -0.25F, 1, 1, 1, 0.0F, false));

        this.carapace_r2 = new AdvancedModelRenderer(this);
        this.carapace_r2.setRotationPoint(-1.5F, 0.0F, -7.25F);
        this.body.addChild(carapace_r2);
        this.setRotateAngle(carapace_r2, 0.0F, -0.2269F, 0.0F);
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 9, 24, -0.1F, -3.0F, 0.0F, 2, 2, 1, -0.02F, false));
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 0, 24, -0.1F, -3.0F, 0.5F, 2, 2, 5, -0.015F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -3.49F, -1.0F, 1.0F, 7, 2, 10, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 30, 16, -3.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F, false));

        this.baby5 = new AdvancedModelRenderer(this);
        this.baby5.setRotationPoint(0.0F, -1.0F, 9.25F);
        this.abdomen.addChild(baby5);
        this.setRotateAngle(baby5, 0.0F, 2.8362F, 0.0F);
        this.baby5.cubeList.add(new ModelBox(baby5, 46, 23, -1.0F, -1.0F, -1.75F, 2, 1, 3, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.abdomen.addChild(abdomen2);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 14, 27, -2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.abdomen2.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 10, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 32, -1.499F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 28, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 19, -1.499F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 28, 0, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 5, -0.999F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 5, 0, -0.499F, 0.0F, 2.0F, 1, 0, 2, 0.0F, false));

        this.baby4 = new AdvancedModelRenderer(this);
        this.baby4.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.abdomen.addChild(baby4);
        this.setRotateAngle(baby4, 0.0F, 0.5236F, 0.0F);
        this.baby4.cubeList.add(new ModelBox(baby4, 46, 23, -1.0F, -1.0F, -1.75F, 2, 1, 3, 0.0F, false));

        this.baby3 = new AdvancedModelRenderer(this);
        this.baby3.setRotationPoint(1.75F, -1.0F, 7.0F);
        this.abdomen.addChild(baby3);
        this.setRotateAngle(baby3, 0.0F, -2.4435F, 0.0F);
        this.baby3.cubeList.add(new ModelBox(baby3, 46, 23, -1.0F, -1.0F, -1.75F, 2, 1, 3, 0.0F, false));

        this.baby2 = new AdvancedModelRenderer(this);
        this.baby2.setRotationPoint(1.75F, -1.0F, 4.0F);
        this.abdomen.addChild(baby2);
        this.setRotateAngle(baby2, 0.0F, 0.2182F, 0.0F);
        this.baby2.cubeList.add(new ModelBox(baby2, 46, 23, -1.0F, -1.0F, -1.75F, 2, 1, 3, 0.0F, false));

        this.baby1 = new AdvancedModelRenderer(this);
        this.baby1.setRotationPoint(-1.5F, -1.0F, 3.5F);
        this.abdomen.addChild(baby1);
        this.setRotateAngle(baby1, 0.0F, -0.4363F, 0.0F);
        this.baby1.cubeList.add(new ModelBox(baby1, 46, 23, -1.0F, -1.0F, -1.75F, 2, 1, 3, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.5F, -2.5F, -7.0F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.0F, 0.3491F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 24, 7, -6.25F, 0.0F, -1.5F, 7, 1, 2, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-6.25F, 0.0F, -0.5F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, 0.8727F, 0.0F);


        this.armR2_r1 = new AdvancedModelRenderer(this);
        this.armR2_r1.setRotationPoint(6.75F, 2.0F, 8.0F);
        this.armR2.addChild(armR2_r1);
        this.setRotateAngle(armR2_r1, 0.0F, 0.0873F, 0.0F);
        this.armR2_r1.cubeList.add(new ModelBox(armR2_r1, 0, 31, -7.0F, -2.1F, -12.0F, 2, 1, 4, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-0.25F, 0.0F, -3.0F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, -0.2618F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 19, 16, -0.75F, 0.05F, -10.0F, 2, 0, 7, 0.0F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 0, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(0.25F, 1.0F, -3.0F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, -0.3491F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 17, 0, -0.75F, -0.15F, -7.0F, 2, 0, 7, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(1.5F, -2.5F, -7.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.0F, -0.3491F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 24, 7, -0.75F, 0.0F, -1.5F, 7, 1, 2, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(6.25F, 0.0F, -0.5F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.8727F, 0.0F);


        this.armR3_r1 = new AdvancedModelRenderer(this);
        this.armR3_r1.setRotationPoint(-6.75F, 2.0F, 8.0F);
        this.armL2.addChild(armR3_r1);
        this.setRotateAngle(armR3_r1, 0.0F, -0.0873F, 0.0F);
        this.armR3_r1.cubeList.add(new ModelBox(armR3_r1, 0, 31, 5.0F, -2.1F, -12.0F, 2, 1, 4, 0.0F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(0.25F, 0.0F, -3.0F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, 0.2618F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 19, 16, -1.25F, 0.05F, -10.0F, 2, 0, 7, 0.0F, true));
        this.armL3.cubeList.add(new ModelBox(armL3, 0, 0, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, true));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(-0.25F, 1.0F, -3.0F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.3491F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 17, 0, -1.25F, -0.15F, -7.0F, 2, 0, 7, 0.0F, true));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraR);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 8, 31, -1.125F, -0.901F, -1.75F, 1, 1, 2, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraL);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 8, 31, 0.125F, -0.901F, -1.75F, 1, 1, 2, 0.0F, true));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsR);


        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.75F, -2.5F, -6.5F);
        this.legsR.addChild(legR);
        this.setRotateAngle(legR, -0.5236F, 0.0F, 0.0873F);
        this.legR.cubeList.add(new ModelBox(legR, 24, 34, -6.0F, -0.5F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, -2.0F, -5.75F);
        this.legsR.addChild(legR2);
        this.setRotateAngle(legR2, -0.5236F, 0.3491F, -0.0436F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 20, -9.8307F, -2.0F, -0.0175F, 10, 4, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, -2.0F, -4.45F);
        this.legsR.addChild(legR3);
        this.setRotateAngle(legR3, -0.5236F, 0.5236F, -0.0436F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 16, -13.0391F, -2.0F, 0.0498F, 13, 4, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, -2.0F, -2.75F);
        this.legsR.addChild(legR4);
        this.setRotateAngle(legR4, -0.5236F, 0.9599F, -0.0436F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 12, -16.8533F, -2.0F, 0.0031F, 17, 4, 0, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsL);


        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.75F, -2.5F, -6.5F);
        this.legsL.addChild(legL);
        this.setRotateAngle(legL, -0.5236F, 0.0F, -0.0873F);
        this.legL.cubeList.add(new ModelBox(legL, 24, 34, 0.0F, -0.5F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, -2.0F, -5.75F);
        this.legsL.addChild(legL2);
        this.setRotateAngle(legL2, -0.5236F, -0.3491F, 0.0436F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 20, -0.1693F, -2.0F, -0.0175F, 10, 4, 0, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, -2.0F, -4.45F);
        this.legsL.addChild(legL3);
        this.setRotateAngle(legL3, -0.5236F, -0.5236F, 0.0436F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 16, 0.0391F, -2.0F, 0.0498F, 13, 4, 0, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, -2.0F, -2.75F);
        this.legsL.addChild(legL4);
        this.setRotateAngle(legL4, -0.5236F, -0.9599F, 0.0436F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 12, -0.1467F, -2.0F, 0.0031F, 17, 4, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(abdomen, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(abdomen2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail6, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(armR, -0.3F, 0.0F, 0.0F);
        this.body.offsetZ = -0.03F;
        this.body.offsetY = 0.35F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.1F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = -0.6F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(abdomen, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(abdomen2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail6, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armL, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(armR, -0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.resetToDefaultPose();

        //this.cheliceraL.swing(0.85F, (float)Math.toRadians(-25), false, 0, 0F, f2, 1.0F);
        //this.cheliceraR.swing(0.85F, (float)Math.toRadians(25), false, 0, 0F, f2, 1.0F);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraWalkingAmphibianBase ee = (EntityPrehistoricFloraWalkingAmphibianBase) entitylivingbaseIn;

        if (ee.isReallyInWater() ) {//swimming
                if (ee.getIsMoving()) {
                    if(ee instanceof EntityPrehistoricFloraEramoscorpius) {
                        animWalkingEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {//Praearcturus
                        if(ee.getIsFast()) {//fast
                            animWalkingEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        } else {//slow
                            animWalkingPrae(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                } else {
                    animWalkingEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }

        }
        else {
            //land pose:
            if (!ee.getIsMoving()) { //static on land
                if(ee instanceof EntityPrehistoricFloraEramoscorpius) {
                    animWalkingLandEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                } else {//Praearcturus
                    animWalkingLandPrae(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
            else {
                //moving on land
                if(ee instanceof EntityPrehistoricFloraEramoscorpius) {
                    animWalkingLandEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {//Praearcturus
                    animWalkingLandPrae(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
        }
        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            if(ee instanceof EntityPrehistoricFloraEramoscorpius) {
                animAttackEramo(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            } else {//Praearcturus
                animAttackPrae(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }

    }
    public void animAttackPrae(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPraearcturus entity = (EntityPrehistoricFloraPraearcturus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (48.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 48.5 + (((tickAnim - 3) / 3) * (80-(48.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 80 + (((tickAnim - 6) / 4) * (51.41495-(80)));
            yy = 0 + (((tickAnim - 6) / 4) * (2.0123-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (1.48377-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 51.41495 + (((tickAnim - 10) / 3) * (27.5-(51.41495)));
            yy = 2.0123 + (((tickAnim - 10) / 3) * (0-(2.0123)));
            zz = 1.48377 + (((tickAnim - 10) / 3) * (0-(1.48377)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 27.5 + (((tickAnim - 13) / 9) * (0-(27.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 0) / 3) * (-19.9-(-4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -19.9 + (((tickAnim - 3) / 1) * (-9.93-(-19.9)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -9.93 + (((tickAnim - 4) / 2) * (47.5-(-9.93)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 47.5 + (((tickAnim - 6) / 2) * (24.5-(47.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 8) / 5) * (28.19-(24.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 28.19 + (((tickAnim - 13) / 9) * (-4-(28.19)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (0.4981-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.04358-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-4.99981-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.4981 + (((tickAnim - 4) / 2) * (12.5-(0.4981)));
            yy = 0.04358 + (((tickAnim - 4) / 2) * (0-(0.04358)));
            zz = -4.99981 + (((tickAnim - 4) / 2) * (0-(-4.99981)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 6) / 2) * (17.17826-(12.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.48016-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (4.77642-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 17.17826 + (((tickAnim - 8) / 14) * (-5-(17.17826)));
            yy = -1.48016 + (((tickAnim - 8) / 14) * (0-(-1.48016)));
            zz = 4.77642 + (((tickAnim - 8) / 14) * (0-(4.77642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 6) / 16) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 16) * (0-(1)));
            zz = 0 + (((tickAnim - 6) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 0) / 3) * (-18.5-(-1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -18.5 + (((tickAnim - 3) / 1) * (-12.67-(-18.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.67 + (((tickAnim - 4) / 2) * (36.5-(-12.67)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 36.5 + (((tickAnim - 6) / 2) * (29.53-(36.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 29.53 + (((tickAnim - 8) / 14) * (-1-(29.53)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6 + (((tickAnim - 0) / 3) * (-15-(6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15 + (((tickAnim - 3) / 1) * (-7.5-(-15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -7.5 + (((tickAnim - 4) / 2) * (22.5-(-7.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 6) / 2) * (47.5-(22.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 47.5 + (((tickAnim - 8) / 6) * (24.69-(47.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 24.69 + (((tickAnim - 14) / 8) * (6-(24.69)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4 + (((tickAnim - 0) / 3) * (9.5-(4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.5 + (((tickAnim - 3) / 1) * (-6.17-(9.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -6.17 + (((tickAnim - 4) / 2) * (15-(-6.17)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 6) / 2) * (18.16-(15)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 18.16 + (((tickAnim - 8) / 6) * (48.41-(18.16)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 48.41 + (((tickAnim - 14) / 8) * (4-(48.41)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.5 + (((tickAnim - 0) / 3) * (15-(25.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 3) / 1) * (31.83-(15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 31.83 + (((tickAnim - 4) / 2) * (8-(31.83)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 6) / 2) * (15.63-(8)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 15.63 + (((tickAnim - 8) / 6) * (21.03-(15.63)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 21.03 + (((tickAnim - 14) / 8) * (25.5-(21.03)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99 + (((tickAnim - 0) / 3) * (59-(99)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 59 + (((tickAnim - 3) / 1) * (54.83-(59)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 54.83 + (((tickAnim - 4) / 2) * (9-(54.83)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 6) / 2) * (15.45-(9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 15.45 + (((tickAnim - 8) / 6) * (11.7-(15.45)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 11.7 + (((tickAnim - 14) / 8) * (99-(11.7)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99.5 + (((tickAnim - 0) / 3) * (66-(99.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 66 + (((tickAnim - 3) / 1) * (64.67-(66)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 64.67 + (((tickAnim - 4) / 1) * (43.34-(64.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 43.34 + (((tickAnim - 5) / 1) * (19.5-(43.34)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 6) / 2) * (5.29-(19.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 5.29 + (((tickAnim - 8) / 6) * (6.69-(5.29)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 6.69 + (((tickAnim - 14) / 8) * (99.5-(6.69)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.93026 + (((tickAnim - 0) / 3) * (5.18211-(4.93026)));
            yy = 41.92217 + (((tickAnim - 0) / 3) * (-21.83882-(41.92217)));
            zz = 22.02632 + (((tickAnim - 0) / 3) * (17.74173-(22.02632)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5.18211 + (((tickAnim - 3) / 0) * (2.91706-(5.18211)));
            yy = -21.83882 + (((tickAnim - 3) / 0) * (-59.04901-(-21.83882)));
            zz = 17.74173 + (((tickAnim - 3) / 0) * (15.8248-(17.74173)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.91706 + (((tickAnim - 3) / 5) * (-24.97115-(2.91706)));
            yy = -59.04901 + (((tickAnim - 3) / 5) * (-53.52992-(-59.04901)));
            zz = 15.8248 + (((tickAnim - 3) / 5) * (31.42315-(15.8248)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -24.97115 + (((tickAnim - 8) / 6) * (-18.62069-(-24.97115)));
            yy = -53.52992 + (((tickAnim - 8) / 6) * (-45.81785-(-53.52992)));
            zz = 31.42315 + (((tickAnim - 8) / 6) * (16.53184-(31.42315)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -18.62069 + (((tickAnim - 14) / 8) * (4.93026-(-18.62069)));
            yy = -45.81785 + (((tickAnim - 14) / 8) * (41.92217-(-45.81785)));
            zz = 16.53184 + (((tickAnim - 14) / 8) * (22.02632-(16.53184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -60 + (((tickAnim - 0) / 1) * (8.88-(-60)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 8.88 + (((tickAnim - 1) / 2) * (-14.22-(8.88)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 3) / 14) * (0-(0)));
            yy = -14.22 + (((tickAnim - 3) / 14) * (-7.62-(-14.22)));
            zz = 0 + (((tickAnim - 3) / 14) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -7.62 + (((tickAnim - 17) / 5) * (-60-(-7.62)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -67.5 + (((tickAnim - 0) / 3) * (-5.66-(-67.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -5.66 + (((tickAnim - 3) / 1) * (-4.22-(-5.66)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            yy = -4.22 + (((tickAnim - 4) / 10) * (-36.84-(-4.22)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -36.84 + (((tickAnim - 14) / 4) * (-27.57-(-36.84)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -27.57 + (((tickAnim - 18) / 4) * (-67.5-(-27.57)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 0) / 2) * (-32.5-(17.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -32.5 + (((tickAnim - 2) / 1) * (17.5-(-32.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            yy = 17.5 + (((tickAnim - 3) / 19) * (17.5-(17.5)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(xx), clawR.rotateAngleY + (float) Math.toRadians(yy), clawR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.93026 + (((tickAnim - 0) / 3) * (4.87094-(4.93026)));
            yy = -41.92217 + (((tickAnim - 0) / 3) * (32.19226-(-41.92217)));
            zz = -22.02632 + (((tickAnim - 0) / 3) * (-16.43064-(-22.02632)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4.87094 + (((tickAnim - 3) / 1) * (2.91706-(4.87094)));
            yy = 32.19226 + (((tickAnim - 3) / 1) * (59.04901-(32.19226)));
            zz = -16.43064 + (((tickAnim - 3) / 1) * (-15.8248-(-16.43064)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 2.91706 + (((tickAnim - 4) / 4) * (-29.02969-(2.91706)));
            yy = 59.04901 + (((tickAnim - 4) / 4) * (43.61055-(59.04901)));
            zz = -15.8248 + (((tickAnim - 4) / 4) * (-30.44257-(-15.8248)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.02969 + (((tickAnim - 8) / 7) * (-14.04422-(-29.02969)));
            yy = 43.61055 + (((tickAnim - 8) / 7) * (34.63984-(43.61055)));
            zz = -30.44257 + (((tickAnim - 8) / 7) * (-24.77166-(-30.44257)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -14.04422 + (((tickAnim - 15) / 7) * (4.93026-(-14.04422)));
            yy = 34.63984 + (((tickAnim - 15) / 7) * (-41.92217-(34.63984)));
            zz = -24.77166 + (((tickAnim - 15) / 7) * (-22.02632-(-24.77166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 60 + (((tickAnim - 0) / 1) * (-12.15-(60)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -12.15 + (((tickAnim - 1) / 2) * (11.72-(-12.15)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 11.72 + (((tickAnim - 3) / 11) * (0.99-(11.72)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.99 + (((tickAnim - 14) / 8) * (60-(0.99)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 67.5 + (((tickAnim - 0) / 2) * (5.16-(67.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 5.16 + (((tickAnim - 2) / 1) * (11.72-(5.16)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 11.72 + (((tickAnim - 3) / 8) * (42.86-(11.72)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = 42.86 + (((tickAnim - 11) / 8) * (39.5-(42.86)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 39.5 + (((tickAnim - 19) / 3) * (67.5-(39.5)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 0) / 2) * (27.5-(-17.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 27.5 + (((tickAnim - 2) / 1) * (-17.5-(27.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            yy = -17.5 + (((tickAnim - 3) / 19) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(xx), clawL.rotateAngleY + (float) Math.toRadians(yy), clawL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.13823 + (((tickAnim - 0) / 4) * (2.23825-(-0.13823)));
            yy = 18.4199 + (((tickAnim - 0) / 4) * (17.28894-(18.4199)));
            zz = -5.00175 + (((tickAnim - 0) / 4) * (2.43864-(-5.00175)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.23825 + (((tickAnim - 4) / 2) * (1.69826-(2.23825)));
            yy = 17.28894 + (((tickAnim - 4) / 2) * (15.61084-(17.28894)));
            zz = 2.43864 + (((tickAnim - 4) / 2) * (4.89315-(2.43864)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.69826 + (((tickAnim - 6) / 2) * (1.36309-(1.69826)));
            yy = 15.61084 + (((tickAnim - 6) / 2) * (17.03677-(15.61084)));
            zz = 4.89315 + (((tickAnim - 6) / 2) * (4.55267-(4.89315)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.36309 + (((tickAnim - 8) / 7) * (-0.67717-(1.36309)));
            yy = 17.03677 + (((tickAnim - 8) / 7) * (19.05018-(17.03677)));
            zz = 4.55267 + (((tickAnim - 8) / 7) * (2.16009-(4.55267)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -0.67717 + (((tickAnim - 15) / 7) * (-0.13823-(-0.67717)));
            yy = 19.05018 + (((tickAnim - 15) / 7) * (18.4199-(19.05018)));
            zz = 2.16009 + (((tickAnim - 15) / 7) * (-5.00175-(2.16009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.84693 + (((tickAnim - 0) / 4) * (-0.92287-(-2.84693)));
            yy = 12.38438 + (((tickAnim - 0) / 4) * (11.48494-(12.38438)));
            zz = -0.64684 + (((tickAnim - 0) / 4) * (2.55504-(-0.64684)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.92287 + (((tickAnim - 4) / 2) * (-4.51529-(-0.92287)));
            yy = 11.48494 + (((tickAnim - 4) / 2) * (10.55882-(11.48494)));
            zz = 2.55504 + (((tickAnim - 4) / 2) * (-3.8479-(2.55504)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.51529 + (((tickAnim - 6) / 2) * (-6.30629-(-4.51529)));
            yy = 10.55882 + (((tickAnim - 6) / 2) * (10.44431-(10.55882)));
            zz = -3.8479 + (((tickAnim - 6) / 2) * (-7.7918-(-3.8479)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -6.30629 + (((tickAnim - 8) / 14) * (-2.84693-(-6.30629)));
            yy = 10.44431 + (((tickAnim - 8) / 14) * (12.38438-(10.44431)));
            zz = -7.7918 + (((tickAnim - 8) / 14) * (-0.64684-(-7.7918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.22177 + (((tickAnim - 0) / 4) * (1.18522-(2.22177)));
            yy = 19.88953 + (((tickAnim - 0) / 4) * (19.41547-(19.88953)));
            zz = 3.81745 + (((tickAnim - 0) / 4) * (2.45742-(3.81745)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1.18522 + (((tickAnim - 4) / 2) * (-9.45332-(1.18522)));
            yy = 19.41547 + (((tickAnim - 4) / 2) * (16.12982-(19.41547)));
            zz = 2.45742 + (((tickAnim - 4) / 2) * (-12.17123-(2.45742)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.45332 + (((tickAnim - 6) / 2) * (-13.68177-(-9.45332)));
            yy = 16.12982 + (((tickAnim - 6) / 2) * (15.43472-(16.12982)));
            zz = -12.17123 + (((tickAnim - 6) / 2) * (-18.95736-(-12.17123)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -13.68177 + (((tickAnim - 8) / 7) * (-5.93219-(-13.68177)));
            yy = 15.43472 + (((tickAnim - 8) / 7) * (18.64724-(15.43472)));
            zz = -18.95736 + (((tickAnim - 8) / 7) * (-7.8271-(-18.95736)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -5.93219 + (((tickAnim - 15) / 7) * (2.22177-(-5.93219)));
            yy = 18.64724 + (((tickAnim - 15) / 7) * (19.88953-(18.64724)));
            zz = -7.8271 + (((tickAnim - 15) / 7) * (3.81745-(-7.8271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.54586 + (((tickAnim - 0) / 4) * (14.88708-(25.54586)));
            yy = 14.5477 + (((tickAnim - 0) / 4) * (14.86964-(14.5477)));
            zz = 13.6227 + (((tickAnim - 0) / 4) * (2.25138-(13.6227)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 14.88708 + (((tickAnim - 4) / 2) * (-16.22198-(14.88708)));
            yy = 14.86964 + (((tickAnim - 4) / 2) * (10.53088-(14.86964)));
            zz = 2.25138 + (((tickAnim - 4) / 2) * (-31.74139-(2.25138)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16.22198 + (((tickAnim - 6) / 2) * (-25.42087-(-16.22198)));
            yy = 10.53088 + (((tickAnim - 6) / 2) * (7.77482-(10.53088)));
            zz = -31.74139 + (((tickAnim - 6) / 2) * (-42.83421-(-31.74139)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25.42087 + (((tickAnim - 8) / 7) * (-3.79065-(-25.42087)));
            yy = 7.77482 + (((tickAnim - 8) / 7) * (13.0144-(7.77482)));
            zz = -42.83421 + (((tickAnim - 8) / 7) * (-18.75273-(-42.83421)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -3.79065 + (((tickAnim - 15) / 7) * (25.54586-(-3.79065)));
            yy = 13.0144 + (((tickAnim - 15) / 7) * (14.5477-(13.0144)));
            zz = -18.75273 + (((tickAnim - 15) / 7) * (13.6227-(-18.75273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.13823 + (((tickAnim - 0) / 4) * (-2.63974-(-0.13823)));
            yy = -18.4199 + (((tickAnim - 0) / 4) * (-18.73573-(-18.4199)));
            zz = 5.00175 + (((tickAnim - 0) / 4) * (13.12928-(5.00175)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.63974 + (((tickAnim - 4) / 2) * (1.6073-(-2.63974)));
            yy = -18.73573 + (((tickAnim - 4) / 2) * (-15.42489-(-18.73573)));
            zz = 13.12928 + (((tickAnim - 4) / 2) * (-4.5473-(13.12928)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.6073 + (((tickAnim - 6) / 2) * (3.92973-(1.6073)));
            yy = -15.42489 + (((tickAnim - 6) / 2) * (-15.11507-(-15.42489)));
            zz = -4.5473 + (((tickAnim - 6) / 2) * (-17.58444-(-4.5473)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 3.92973 + (((tickAnim - 8) / 7) * (1.73513-(3.92973)));
            yy = -15.11507 + (((tickAnim - 8) / 7) * (-15.7852-(-15.11507)));
            zz = -17.58444 + (((tickAnim - 8) / 7) * (-6.35284-(-17.58444)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 1.73513 + (((tickAnim - 15) / 7) * (-0.13823-(1.73513)));
            yy = -15.7852 + (((tickAnim - 15) / 7) * (-18.4199-(-15.7852)));
            zz = -6.35284 + (((tickAnim - 15) / 7) * (5.00175-(-6.35284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.84693 + (((tickAnim - 0) / 4) * (-7.86031-(-2.84693)));
            yy = -12.38438 + (((tickAnim - 0) / 4) * (-9.08817-(-12.38438)));
            zz = 0.64684 + (((tickAnim - 0) / 4) * (10.23515-(0.64684)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -7.86031 + (((tickAnim - 4) / 2) * (-4.83158-(-7.86031)));
            yy = -9.08817 + (((tickAnim - 4) / 2) * (-10.09659-(-9.08817)));
            zz = 10.23515 + (((tickAnim - 4) / 2) * (4.53146-(10.23515)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.83158 + (((tickAnim - 6) / 2) * (-0.58038-(-4.83158)));
            yy = -10.09659 + (((tickAnim - 6) / 2) * (-11.85781-(-10.09659)));
            zz = 4.53146 + (((tickAnim - 6) / 2) * (-3.9084-(4.53146)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -0.58038 + (((tickAnim - 8) / 14) * (-2.84693-(-0.58038)));
            yy = -11.85781 + (((tickAnim - 8) / 14) * (-12.38438-(-11.85781)));
            zz = -3.9084 + (((tickAnim - 8) / 14) * (0.64684-(-3.9084)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.22177 + (((tickAnim - 0) / 4) * (-8.66583-(2.22177)));
            yy = -19.88953 + (((tickAnim - 0) / 4) * (-18.86062-(-19.88953)));
            zz = -3.81745 + (((tickAnim - 0) / 4) * (10.47187-(-3.81745)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -8.66583 + (((tickAnim - 4) / 2) * (-9.26976-(-8.66583)));
            yy = -18.86062 + (((tickAnim - 4) / 2) * (-16.10049-(-18.86062)));
            zz = 10.47187 + (((tickAnim - 4) / 2) * (11.98421-(10.47187)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.26976 + (((tickAnim - 6) / 2) * (-5.33997-(-9.26976)));
            yy = -16.10049 + (((tickAnim - 6) / 2) * (-16.40162-(-16.10049)));
            zz = 11.98421 + (((tickAnim - 6) / 2) * (6.60317-(11.98421)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -5.33997 + (((tickAnim - 8) / 14) * (2.22177-(-5.33997)));
            yy = -16.40162 + (((tickAnim - 8) / 14) * (-19.88953-(-16.40162)));
            zz = 6.60317 + (((tickAnim - 8) / 14) * (-3.81745-(6.60317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.54586 + (((tickAnim - 0) / 4) * (0.0049-(25.54586)));
            yy = -14.5477 + (((tickAnim - 0) / 4) * (-14.58814-(-14.5477)));
            zz = -13.6227 + (((tickAnim - 0) / 4) * (13.64487-(-13.6227)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.0049 + (((tickAnim - 4) / 2) * (-13.7262-(0.0049)));
            yy = -14.58814 + (((tickAnim - 4) / 2) * (-10.02246-(-14.58814)));
            zz = 13.64487 + (((tickAnim - 4) / 2) * (29.07094-(13.64487)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -13.7262 + (((tickAnim - 6) / 2) * (-13.12523-(-13.7262)));
            yy = -10.02246 + (((tickAnim - 6) / 2) * (-7.70691-(-10.02246)));
            zz = 29.07094 + (((tickAnim - 6) / 2) * (28.762-(29.07094)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -13.12523 + (((tickAnim - 8) / 7) * (2.84469-(-13.12523)));
            yy = -7.70691 + (((tickAnim - 8) / 7) * (-12.6249-(-7.70691)));
            zz = 28.762 + (((tickAnim - 8) / 7) * (11.23296-(28.762)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 2.84469 + (((tickAnim - 15) / 7) * (25.54586-(2.84469)));
            yy = -12.6249 + (((tickAnim - 15) / 7) * (-14.5477-(-12.6249)));
            zz = 11.23296 + (((tickAnim - 15) / 7) * (-13.6227-(11.23296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalkingPrae(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPraearcturus entity = (EntityPrehistoricFloraPraearcturus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -2.4 + (((tickAnim - 0) / 6) * (-0.75-(-2.4)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -2.5 + (((tickAnim - 0) / 6) * (-1.93-(-2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.75 + (((tickAnim - 6) / 6) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = -1.93 + (((tickAnim - 6) / 6) * (-0.16667-(-1.93)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 12) / 6) * (1.87-(-0.16667)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.75 + (((tickAnim - 18) / 7) * (-2.5-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 1.87 + (((tickAnim - 18) / 7) * (2.5-(1.87)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -2.5 + (((tickAnim - 25) / 7) * (-4.15-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 2.5 + (((tickAnim - 25) / 7) * (1.87-(2.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -4.15 + (((tickAnim - 32) / 6) * (-5-(-4.15)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 1.87 + (((tickAnim - 32) / 6) * (-0.16667-(1.87)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -5 + (((tickAnim - 38) / 6) * (-4.15-(-5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 38) / 6) * (-1.93-(-0.16667)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -4.15 + (((tickAnim - 44) / 6) * (-2.4-(-4.15)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = -1.93 + (((tickAnim - 44) / 6) * (-2.5-(-1.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.19 + (((tickAnim - 0) / 2) * (0-(0.19)));
            yy = -0.93 + (((tickAnim - 0) / 2) * (-1-(-0.93)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (-0.67-(0)));
            yy = -1 + (((tickAnim - 2) / 6) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -0.67 + (((tickAnim - 8) / 6) * (-1-(-0.67)));
            yy = -0.73 + (((tickAnim - 8) / 6) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 14) / 6) * (-0.73-(-1)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -0.73 + (((tickAnim - 20) / 7) * (0-(-0.73)));
            yy = 0.67 + (((tickAnim - 20) / 7) * (1-(0.67)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0.73-(0)));
            yy = 1 + (((tickAnim - 27) / 6) * (0.67-(1)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0.73 + (((tickAnim - 33) / 6) * (1-(0.73)));
            yy = 0.67 + (((tickAnim - 33) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 39) / 6) * (0.77-(1)));
            yy = 0 + (((tickAnim - 39) / 6) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.77 + (((tickAnim - 45) / 5) * (0.19-(0.77)));
            yy = -0.73 + (((tickAnim - 45) / 5) * (-0.93-(-0.73)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.41 + (((tickAnim - 0) / 3) * (-2.8-(-2.41)));
            yy = -0.86 + (((tickAnim - 0) / 3) * (-1-(-0.86)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -2.8 + (((tickAnim - 3) / 6) * (-3.47-(-2.8)));
            yy = -1 + (((tickAnim - 3) / 6) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -3.47 + (((tickAnim - 9) / 7) * (-3.8-(-3.47)));
            yy = -0.73 + (((tickAnim - 9) / 7) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -3.8 + (((tickAnim - 16) / 6) * (-3.53-(-3.8)));
            yy = 0 + (((tickAnim - 16) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -3.53 + (((tickAnim - 22) / 6) * (-2.8-(-3.53)));
            yy = 0.67 + (((tickAnim - 22) / 6) * (1-(0.67)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.8 + (((tickAnim - 28) / 7) * (-2.07-(-2.8)));
            yy = 1 + (((tickAnim - 28) / 7) * (0.67-(1)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -2.07 + (((tickAnim - 35) / 6) * (-1.8-(-2.07)));
            yy = 0.67 + (((tickAnim - 35) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = -1.8 + (((tickAnim - 41) / 6) * (-2.03-(-1.8)));
            yy = 0 + (((tickAnim - 41) / 6) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -2.03 + (((tickAnim - 47) / 3) * (-2.41-(-2.03)));
            yy = -0.73 + (((tickAnim - 47) / 3) * (-0.86-(-0.73)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.62 + (((tickAnim - 0) / 4) * (-3.1-(-2.62)));
            yy = -0.83 + (((tickAnim - 0) / 4) * (-1-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -3.1 + (((tickAnim - 4) / 5) * (-3.77-(-3.1)));
            yy = -1 + (((tickAnim - 4) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -3.77 + (((tickAnim - 9) / 7) * (-4.1-(-3.77)));
            yy = -0.73 + (((tickAnim - 9) / 7) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -4.1 + (((tickAnim - 16) / 6) * (-3.83-(-4.1)));
            yy = 0 + (((tickAnim - 16) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -3.83 + (((tickAnim - 22) / 6) * (-3.1-(-3.83)));
            yy = 0.67 + (((tickAnim - 22) / 6) * (1-(0.67)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -3.1 + (((tickAnim - 28) / 7) * (-2.37-(-3.1)));
            yy = 1 + (((tickAnim - 28) / 7) * (0.67-(1)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -2.37 + (((tickAnim - 35) / 6) * (-2.1-(-2.37)));
            yy = 0.67 + (((tickAnim - 35) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = -2.1 + (((tickAnim - 41) / 6) * (-2.33-(-2.1)));
            yy = 0 + (((tickAnim - 41) / 6) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -2.33 + (((tickAnim - 47) / 3) * (-2.62-(-2.33)));
            yy = -0.73 + (((tickAnim - 47) / 3) * (-0.83-(-0.73)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2.67 + (((tickAnim - 0) / 6) * (2-(2.67)));
            yy = -0.76 + (((tickAnim - 0) / 6) * (-1-(-0.76)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 2 + (((tickAnim - 6) / 5) * (1.33-(2)));
            yy = -1 + (((tickAnim - 6) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 1.33 + (((tickAnim - 11) / 7) * (1-(1.33)));
            yy = -0.73 + (((tickAnim - 11) / 7) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (1.27-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.67-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1.27 + (((tickAnim - 23) / 7) * (2-(1.27)));
            yy = 0.67 + (((tickAnim - 23) / 7) * (1-(0.67)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 2 + (((tickAnim - 30) / 7) * (2.73-(2)));
            yy = 1 + (((tickAnim - 30) / 7) * (0.67-(1)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 2.73 + (((tickAnim - 37) / 6) * (3-(2.73)));
            yy = 0.67 + (((tickAnim - 37) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 3 + (((tickAnim - 43) / 5) * (2.77-(3)));
            yy = 0 + (((tickAnim - 43) / 5) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 2.77 + (((tickAnim - 48) / 2) * (2.67-(2.77)));
            yy = -0.73 + (((tickAnim - 48) / 2) * (-0.76-(-0.73)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5.6 + (((tickAnim - 0) / 1) * (5.57-(5.6)));
            yy = -0.63 + (((tickAnim - 0) / 1) * (-0.73-(-0.63)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 5.57 + (((tickAnim - 1) / 7) * (4.8-(5.57)));
            yy = -0.73 + (((tickAnim - 1) / 7) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.8 + (((tickAnim - 8) / 5) * (4.13-(4.8)));
            yy = -1 + (((tickAnim - 8) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 4.13 + (((tickAnim - 13) / 6) * (3.8-(4.13)));
            yy = -0.73 + (((tickAnim - 13) / 6) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 3.8 + (((tickAnim - 19) / 6) * (4.07-(3.8)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 4.07 + (((tickAnim - 25) / 7) * (4.8-(4.07)));
            yy = 0.67 + (((tickAnim - 25) / 7) * (1-(0.67)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 4.8 + (((tickAnim - 32) / 6) * (5.53-(4.8)));
            yy = 1 + (((tickAnim - 32) / 6) * (0.67-(1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 5.53 + (((tickAnim - 38) / 6) * (5.8-(5.53)));
            yy = 0.67 + (((tickAnim - 38) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 5.8 + (((tickAnim - 44) / 6) * (5.6-(5.8)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.63-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40.37 + (((tickAnim - 0) / 3) * (40.27-(40.37)));
            yy = -0.42 + (((tickAnim - 0) / 3) * (-0.73-(-0.42)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 40.27 + (((tickAnim - 3) / 6) * (39.5-(40.27)));
            yy = -0.73 + (((tickAnim - 3) / 6) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 39.5 + (((tickAnim - 9) / 5) * (38.83-(39.5)));
            yy = -1 + (((tickAnim - 9) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 38.83 + (((tickAnim - 14) / 7) * (38.5-(38.83)));
            yy = -0.73 + (((tickAnim - 14) / 7) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 38.5 + (((tickAnim - 21) / 6) * (38.77-(38.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 38.77 + (((tickAnim - 27) / 6) * (39.5-(38.77)));
            yy = 0.67 + (((tickAnim - 27) / 6) * (1-(0.67)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 39.5 + (((tickAnim - 33) / 7) * (40.23-(39.5)));
            yy = 1 + (((tickAnim - 33) / 7) * (0.67-(1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 40.23 + (((tickAnim - 40) / 6) * (40.5-(40.23)));
            yy = 0.67 + (((tickAnim - 40) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 40.5 + (((tickAnim - 46) / 4) * (40.37-(40.5)));
            yy = 0 + (((tickAnim - 46) / 4) * (-0.42-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 90.03 + (((tickAnim - 0) / 4) * (89.87-(90.03)));
            yy = -0.21 + (((tickAnim - 0) / 4) * (-0.73-(-0.21)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 89.87 + (((tickAnim - 4) / 7) * (89.1-(89.87)));
            yy = -0.73 + (((tickAnim - 4) / 7) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 89.1 + (((tickAnim - 11) / 5) * (88.43-(89.1)));
            yy = -1 + (((tickAnim - 11) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 88.43 + (((tickAnim - 16) / 7) * (88.1-(88.43)));
            yy = -0.73 + (((tickAnim - 16) / 7) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 88.1 + (((tickAnim - 23) / 5) * (88.37-(88.1)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.67-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 88.37 + (((tickAnim - 28) / 7) * (89.1-(88.37)));
            yy = 0.67 + (((tickAnim - 28) / 7) * (1-(0.67)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 89.1 + (((tickAnim - 35) / 7) * (89.83-(89.1)));
            yy = 1 + (((tickAnim - 35) / 7) * (0.67-(1)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 89.83 + (((tickAnim - 42) / 6) * (90.1-(89.83)));
            yy = 0.67 + (((tickAnim - 42) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 90.1 + (((tickAnim - 48) / 2) * (90.03-(90.1)));
            yy = 0 + (((tickAnim - 48) / 2) * (-0.21-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 86.8 + (((tickAnim - 0) / 6) * (86.57-(86.8)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 86.57 + (((tickAnim - 6) / 7) * (85.8-(86.57)));
            yy = -0.73 + (((tickAnim - 6) / 7) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 85.8 + (((tickAnim - 13) / 5) * (85.13-(85.8)));
            yy = -1 + (((tickAnim - 13) / 5) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 85.13 + (((tickAnim - 18) / 6) * (84.8-(85.13)));
            yy = -0.73 + (((tickAnim - 18) / 6) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 84.8 + (((tickAnim - 24) / 6) * (85.07-(84.8)));
            yy = 0 + (((tickAnim - 24) / 6) * (0.67-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 85.07 + (((tickAnim - 30) / 7) * (85.8-(85.07)));
            yy = 0.67 + (((tickAnim - 30) / 7) * (1-(0.67)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 85.8 + (((tickAnim - 37) / 6) * (86.53-(85.8)));
            yy = 1 + (((tickAnim - 37) / 6) * (0.67-(1)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 86.53 + (((tickAnim - 43) / 6) * (86.8-(86.53)));
            yy = 0.67 + (((tickAnim - 43) / 6) * (0-(0.67)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = 86.8 + (((tickAnim - 49) / 1) * (86.8-(86.8)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.57852 + (((tickAnim - 0) / 13) * (7.8565-(9.57852)));
            yy = -7.2747 + (((tickAnim - 0) / 13) * (-15.64508-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 0) / 13) * (9.32922-(20.85613)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 7.8565 + (((tickAnim - 13) / 12) * (9.57852-(7.8565)));
            yy = -15.64508 + (((tickAnim - 13) / 12) * (-7.2747-(-15.64508)));
            zz = 9.32922 + (((tickAnim - 13) / 12) * (20.85613-(9.32922)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 9.57852 + (((tickAnim - 25) / 13) * (8.08431-(9.57852)));
            yy = -7.2747 + (((tickAnim - 25) / 13) * (-5.74118-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 25) / 13) * (10.73259-(20.85613)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 8.08431 + (((tickAnim - 38) / 12) * (9.57852-(8.08431)));
            yy = -5.74118 + (((tickAnim - 38) / 12) * (-7.2747-(-5.74118)));
            zz = 10.73259 + (((tickAnim - 38) / 12) * (20.85613-(10.73259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -32.5 + (((tickAnim - 0) / 13) * (-25-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -25 + (((tickAnim - 13) / 12) * (-22.5-(-25)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -22.5 + (((tickAnim - 25) / 13) * (-25-(-22.5)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -25 + (((tickAnim - 38) / 12) * (-32.5-(-25)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 13) * (-20-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -20 + (((tickAnim - 13) / 12) * (-27.5-(-20)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -27.5 + (((tickAnim - 25) / 13) * (-20-(-27.5)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 12) * (-22.5-(-20)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(20), clawR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 8.08431 + (((tickAnim - 0) / 13) * (9.57852-(8.08431)));
            yy = 5.74118 + (((tickAnim - 0) / 13) * (7.2747-(5.74118)));
            zz = -10.73259 + (((tickAnim - 0) / 13) * (-20.85613-(-10.73259)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.57852 + (((tickAnim - 13) / 12) * (7.8565-(9.57852)));
            yy = 7.2747 + (((tickAnim - 13) / 12) * (15.64508-(7.2747)));
            zz = -20.85613 + (((tickAnim - 13) / 12) * (-9.32922-(-20.85613)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 7.8565 + (((tickAnim - 25) / 13) * (9.57852-(7.8565)));
            yy = 15.64508 + (((tickAnim - 25) / 13) * (7.2747-(15.64508)));
            zz = -9.32922 + (((tickAnim - 25) / 13) * (-20.85613-(-9.32922)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.57852 + (((tickAnim - 38) / 12) * (8.08431-(9.57852)));
            yy = 7.2747 + (((tickAnim - 38) / 12) * (5.74118-(7.2747)));
            zz = -20.85613 + (((tickAnim - 38) / 12) * (-10.73259-(-20.85613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 13) * (32.5-(25)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 32.5 + (((tickAnim - 13) / 12) * (25-(32.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 25 + (((tickAnim - 25) / 13) * (22.5-(25)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 22.5 + (((tickAnim - 38) / 12) * (25-(22.5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 13) * (22.5-(20)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 22.5 + (((tickAnim - 13) / 12) * (20-(22.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 20 + (((tickAnim - 25) / 13) * (27.5-(20)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 27.5 + (((tickAnim - 38) / 12) * (20-(27.5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(-20), clawL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.67 + (((tickAnim - 0) / 3) * (-0.44065-(-2.67)));
            yy = -19.34 + (((tickAnim - 0) / 3) * (-9.99039-(-19.34)));
            zz = 1.28 + (((tickAnim - 0) / 3) * (0.03849-(1.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -0.44065 + (((tickAnim - 3) / 6) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 3) / 6) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 3) / 6) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -10.40439 + (((tickAnim - 9) / 6) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 9) / 6) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 9) / 6) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -11.57885 + (((tickAnim - 15) / 13) * (-0.44065-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 15) / 13) * (-9.99039-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 15) / 13) * (0.03849-(6.26781)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -0.44065 + (((tickAnim - 28) / 6) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 28) / 6) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 28) / 6) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -10.40439 + (((tickAnim - 34) / 6) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 34) / 6) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 34) / 6) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.57885 + (((tickAnim - 40) / 10) * (-2.67-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 40) / 10) * (-19.34-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 40) / 10) * (1.28-(6.26781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.34 + (((tickAnim - 0) / 3) * (2.31028-(1.34)));
            yy = -22.37 + (((tickAnim - 0) / 3) * (-32.11205-(-22.37)));
            zz = 8.93 + (((tickAnim - 0) / 3) * (1.41008-(8.93)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 2.31028 + (((tickAnim - 3) / 13) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 3) / 13) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 3) / 13) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 16) / 7) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 16) / 7) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.60716 + (((tickAnim - 23) / 5) * (2.31028-(0.60716)));
            yy = -15.05933 + (((tickAnim - 23) / 5) * (-32.11205-(-15.05933)));
            zz = 14.577 + (((tickAnim - 23) / 5) * (1.41008-(14.577)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 2.31028 + (((tickAnim - 28) / 13) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 28) / 13) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 28) / 13) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 41) / 7) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 41) / 7) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.60716 + (((tickAnim - 48) / 2) * (1.34-(0.60716)));
            yy = -15.05933 + (((tickAnim - 48) / 2) * (-22.37-(-15.05933)));
            zz = 14.577 + (((tickAnim - 48) / 2) * (8.93-(14.577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.42 + (((tickAnim - 0) / 3) * (5.67-(1.42)));
            yy = -2.25 + (((tickAnim - 0) / 3) * (-8.99-(-2.25)));
            zz = 2 + (((tickAnim - 0) / 3) * (7.98-(2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.67 + (((tickAnim - 3) / 3) * (11.33038-(5.67)));
            yy = -8.99 + (((tickAnim - 3) / 3) * (-17.97524-(-8.99)));
            zz = 7.98 + (((tickAnim - 3) / 3) * (15.96276-(7.98)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 11.33038 + (((tickAnim - 6) / 6) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 6) / 6) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 6) / 6) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -22 + (((tickAnim - 12) / 6) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 12) / 6) * (0-(0.00001)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 18) / 6) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.00003-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -0.00001 + (((tickAnim - 24) / 7) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 24) / 7) * (-17.97524-(0)));
            zz = 0.00003 + (((tickAnim - 24) / 7) * (15.96276-(0.00003)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 11.33038 + (((tickAnim - 31) / 6) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 31) / 6) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 31) / 6) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            yy = -22 + (((tickAnim - 37) / 4) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 37) / 4) * (0-(0.00001)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 41) / 8) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 41) / 8) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 41) / 8) * (0.00003-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -0.00001 + (((tickAnim - 49) / 1) * (1.42-(-0.00001)));
            yy = 0 + (((tickAnim - 49) / 1) * (-2.25-(0)));
            zz = 0.00003 + (((tickAnim - 49) / 1) * (2-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.22707 + (((tickAnim - 0) / 2) * (1.08-(1.22707)));
            yy = -9.96928 + (((tickAnim - 0) / 2) * (-8.39-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 0) / 2) * (0.83-(0.94378)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 1.08 + (((tickAnim - 2) / 5) * (0.65-(1.08)));
            yy = -8.39 + (((tickAnim - 2) / 5) * (0.35-(-8.39)));
            zz = 0.83 + (((tickAnim - 2) / 5) * (0.5-(0.83)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.65 + (((tickAnim - 7) / 6) * (0-(0.65)));
            yy = 0.35 + (((tickAnim - 7) / 6) * (19-(0.35)));
            zz = 0.5 + (((tickAnim - 7) / 6) * (-0.00001-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 13) / 5) * (0.3851-(19)));
            zz = -0.00001 + (((tickAnim - 13) / 5) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17.66376 + (((tickAnim - 18) / 5) * (8.27-(17.66376)));
            yy = 0.3851 + (((tickAnim - 18) / 5) * (-6.82-(0.3851)));
            zz = 21.80407 + (((tickAnim - 18) / 5) * (9.88-(21.80407)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 8.27 + (((tickAnim - 23) / 2) * (1.22707-(8.27)));
            yy = -6.82 + (((tickAnim - 23) / 2) * (-9.96928-(-6.82)));
            zz = 9.88 + (((tickAnim - 23) / 2) * (0.94378-(9.88)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 1.22707 + (((tickAnim - 25) / 3) * (0.98-(1.22707)));
            yy = -9.96928 + (((tickAnim - 25) / 3) * (-7.98-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 25) / 3) * (0.76-(0.94378)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0.98 + (((tickAnim - 28) / 4) * (0.41-(0.98)));
            yy = -7.98 + (((tickAnim - 28) / 4) * (1.51-(-7.98)));
            zz = 0.76 + (((tickAnim - 28) / 4) * (0.32-(0.76)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0.41 + (((tickAnim - 32) / 5) * (0-(0.41)));
            yy = 1.51 + (((tickAnim - 32) / 5) * (19-(1.51)));
            zz = 0.32 + (((tickAnim - 32) / 5) * (-0.00001-(0.32)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 37) / 4) * (8.3851-(19)));
            zz = -0.00001 + (((tickAnim - 37) / 4) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 17.66376 + (((tickAnim - 41) / 4) * (15.32-(17.66376)));
            yy = 8.3851 + (((tickAnim - 41) / 4) * (-2.67-(8.3851)));
            zz = 21.80407 + (((tickAnim - 41) / 4) * (18.82-(21.80407)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 15.32 + (((tickAnim - 45) / 3) * (49.67549-(15.32)));
            yy = -2.67 + (((tickAnim - 45) / 3) * (-24.47814-(-2.67)));
            zz = 18.82 + (((tickAnim - 45) / 3) * (6.22351-(18.82)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 49.67549 + (((tickAnim - 48) / 2) * (1.22707-(49.67549)));
            yy = -24.47814 + (((tickAnim - 48) / 2) * (-9.96928-(-24.47814)));
            zz = 6.22351 + (((tickAnim - 48) / 2) * (0.94378-(6.22351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.08 + (((tickAnim - 0) / 3) * (-11.57885-(-11.08)));
            yy = 51.4 + (((tickAnim - 0) / 3) * (56.7385-(51.4)));
            zz = -14.51 + (((tickAnim - 0) / 3) * (-6.26781-(-14.51)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -11.57885 + (((tickAnim - 3) / 12) * (-0.44065-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 3) / 12) * (9.99039-(56.7385)));
            zz = -6.26781 + (((tickAnim - 3) / 12) * (-0.03849-(-6.26781)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -0.44065 + (((tickAnim - 15) / 7) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 15) / 7) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 15) / 7) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -10.40439 + (((tickAnim - 22) / 6) * (-11.57885-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 22) / 6) * (56.7385-(44.27313)));
            zz = -25.50718 + (((tickAnim - 22) / 6) * (-6.26781-(-25.50718)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -11.57885 + (((tickAnim - 28) / 10) * (-2.67-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 28) / 10) * (19.34-(56.7385)));
            zz = -6.26781 + (((tickAnim - 28) / 10) * (-1.28-(-6.26781)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.67 + (((tickAnim - 38) / 2) * (-0.44065-(-2.67)));
            yy = 19.34 + (((tickAnim - 38) / 2) * (9.99039-(19.34)));
            zz = -1.28 + (((tickAnim - 38) / 2) * (-0.03849-(-1.28)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -0.44065 + (((tickAnim - 40) / 7) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 40) / 7) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 40) / 7) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -10.40439 + (((tickAnim - 47) / 3) * (-11.08-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 47) / 3) * (51.4-(44.27313)));
            zz = -25.50718 + (((tickAnim - 47) / 3) * (-14.51-(-25.50718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.62 + (((tickAnim - 0) / 3) * (0-(0.62)));
            yy = 16.63 + (((tickAnim - 0) / 3) * (11-(16.63)));
            zz = -0.38 + (((tickAnim - 0) / 3) * (-0.00001-(-0.38)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 3) / 7) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 3) / 7) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0.60716 + (((tickAnim - 10) / 6) * (2.31028-(0.60716)));
            yy = 15.05933 + (((tickAnim - 10) / 6) * (32.11205-(15.05933)));
            zz = -14.577 + (((tickAnim - 10) / 6) * (-1.41008-(-14.577)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 2.31028 + (((tickAnim - 16) / 12) * (0-(2.31028)));
            yy = 32.11205 + (((tickAnim - 16) / 12) * (11-(32.11205)));
            zz = -1.41008 + (((tickAnim - 16) / 12) * (-0.00001-(-1.41008)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 28) / 7) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 28) / 7) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.60716 + (((tickAnim - 35) / 3) * (1.34-(0.60716)));
            yy = 15.05933 + (((tickAnim - 35) / 3) * (22.37-(15.05933)));
            zz = -14.577 + (((tickAnim - 35) / 3) * (-8.93-(-14.577)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 1.34 + (((tickAnim - 38) / 3) * (2.31028-(1.34)));
            yy = 22.37 + (((tickAnim - 38) / 3) * (32.11205-(22.37)));
            zz = -8.93 + (((tickAnim - 38) / 3) * (-1.41008-(-8.93)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 2.31028 + (((tickAnim - 41) / 9) * (0.62-(2.31028)));
            yy = 32.11205 + (((tickAnim - 41) / 9) * (16.63-(32.11205)));
            zz = -1.41008 + (((tickAnim - 41) / 9) * (-0.38-(-1.41008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 21.25 + (((tickAnim - 0) / 5) * (16.73-(21.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 5) / 7) * (0-(16.73)));
            zz = 0 + (((tickAnim - 5) / 7) * (-0.00003-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.00001 + (((tickAnim - 12) / 6) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 12) / 6) * (17.97524-(0)));
            zz = -0.00003 + (((tickAnim - 12) / 6) * (-15.96276-(-0.00003)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 11.33038 + (((tickAnim - 18) / 6) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 18) / 6) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 18) / 6) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 22 + (((tickAnim - 24) / 4) * (16.73-(22)));
            zz = -0.00001 + (((tickAnim - 24) / 4) * (0-(-0.00001)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 28) / 9) * (0-(16.73)));
            zz = 0 + (((tickAnim - 28) / 9) * (-0.00003-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -0.00001 + (((tickAnim - 37) / 1) * (1.42-(-0.00001)));
            yy = 0 + (((tickAnim - 37) / 1) * (2.25-(0)));
            zz = -0.00003 + (((tickAnim - 37) / 1) * (-2-(-0.00003)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.42 + (((tickAnim - 38) / 2) * (5.67-(1.42)));
            yy = 2.25 + (((tickAnim - 38) / 2) * (8.99-(2.25)));
            zz = -2 + (((tickAnim - 38) / 2) * (-7.98-(-2)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5.67 + (((tickAnim - 40) / 3) * (11.33038-(5.67)));
            yy = 8.99 + (((tickAnim - 40) / 3) * (17.97524-(8.99)));
            zz = -7.98 + (((tickAnim - 40) / 3) * (-15.96276-(-7.98)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 11.33038 + (((tickAnim - 43) / 6) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 43) / 6) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 43) / 6) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            yy = 22 + (((tickAnim - 49) / 1) * (21.25-(22)));
            zz = -0.00001 + (((tickAnim - 49) / 1) * (0-(-0.00001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 0) / 6) * (-0.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 0) / 6) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.66376 + (((tickAnim - 6) / 4) * (8.27-(17.66376)));
            yy = -0.3851 + (((tickAnim - 6) / 4) * (6.82-(-0.3851)));
            zz = -21.80407 + (((tickAnim - 6) / 4) * (-9.88-(-21.80407)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 8.27 + (((tickAnim - 10) / 3) * (1.22707-(8.27)));
            yy = 6.82 + (((tickAnim - 10) / 3) * (9.96928-(6.82)));
            zz = -9.88 + (((tickAnim - 10) / 3) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.22707 + (((tickAnim - 13) / 2) * (0.98-(1.22707)));
            yy = 9.96928 + (((tickAnim - 13) / 2) * (7.98-(9.96928)));
            zz = -0.94378 + (((tickAnim - 13) / 2) * (-0.76-(-0.94378)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0.98 + (((tickAnim - 15) / 4) * (0.41-(0.98)));
            yy = 7.98 + (((tickAnim - 15) / 4) * (-1.51-(7.98)));
            zz = -0.76 + (((tickAnim - 15) / 4) * (-0.32-(-0.76)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0.41 + (((tickAnim - 19) / 5) * (0-(0.41)));
            yy = -1.51 + (((tickAnim - 19) / 5) * (-19-(-1.51)));
            zz = -0.32 + (((tickAnim - 19) / 5) * (0.00001-(-0.32)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 24) / 4) * (-8.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 24) / 4) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 17.66376 + (((tickAnim - 28) / 5) * (15.32-(17.66376)));
            yy = -8.3851 + (((tickAnim - 28) / 5) * (2.67-(-8.3851)));
            zz = -21.80407 + (((tickAnim - 28) / 5) * (-18.82-(-21.80407)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 15.32 + (((tickAnim - 33) / 2) * (8.27-(15.32)));
            yy = 2.67 + (((tickAnim - 33) / 2) * (7.82-(2.67)));
            zz = -18.82 + (((tickAnim - 33) / 2) * (-9.88-(-18.82)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 8.27 + (((tickAnim - 35) / 3) * (1.22707-(8.27)));
            yy = 7.82 + (((tickAnim - 35) / 3) * (9.96928-(7.82)));
            zz = -9.88 + (((tickAnim - 35) / 3) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 1.22707 + (((tickAnim - 38) / 1) * (1.08-(1.22707)));
            yy = 9.96928 + (((tickAnim - 38) / 1) * (8.39-(9.96928)));
            zz = -0.94378 + (((tickAnim - 38) / 1) * (-0.83-(-0.94378)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 1.08 + (((tickAnim - 39) / 5) * (0.65-(1.08)));
            yy = 8.39 + (((tickAnim - 39) / 5) * (-0.35-(8.39)));
            zz = -0.83 + (((tickAnim - 39) / 5) * (-0.5-(-0.83)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.65 + (((tickAnim - 44) / 6) * (0-(0.65)));
            yy = -0.35 + (((tickAnim - 44) / 6) * (-19-(-0.35)));
            zz = -0.5 + (((tickAnim - 44) / 6) * (0.00001-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalkingLandPrae(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPraearcturus entity = (EntityPrehistoricFloraPraearcturus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = 0;
        if (!isStatic) {
             tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 0) / 18) * (-9.996-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.91123-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.20172-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -9.996 + (((tickAnim - 18) / 3) * (-8.49338-(-9.996)));
            yy = -1.91123 + (((tickAnim - 18) / 3) * (0.66282-(-1.91123)));
            zz = -2.20172 + (((tickAnim - 18) / 3) * (-2.62633-(-2.20172)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -8.49338 + (((tickAnim - 21) / 2) * (-8.09294-(-8.49338)));
            yy = 0.66282 + (((tickAnim - 21) / 2) * (0.32621-(0.66282)));
            zz = -2.62633 + (((tickAnim - 21) / 2) * (2.47864-(-2.62633)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -8.09294 + (((tickAnim - 23) / 2) * (-7.60188-(-8.09294)));
            yy = 0.32621 + (((tickAnim - 23) / 2) * (0.16735-(0.32621)));
            zz = 2.47864 + (((tickAnim - 23) / 2) * (-2.54211-(2.47864)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = -7.60188 + (((tickAnim - 25) / 18) * (-9.61862-(-7.60188)));
            yy = 0.16735 + (((tickAnim - 25) / 18) * (2.31838-(0.16735)));
            zz = -2.54211 + (((tickAnim - 25) / 18) * (1.61683-(-2.54211)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -9.61862 + (((tickAnim - 43) / 3) * (-8.70727-(-9.61862)));
            yy = 2.31838 + (((tickAnim - 43) / 3) * (-0.56726-(2.31838)));
            zz = 1.61683 + (((tickAnim - 43) / 3) * (2.61178-(1.61683)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -8.70727 + (((tickAnim - 46) / 2) * (-8.0907-(-8.70727)));
            yy = -0.56726 + (((tickAnim - 46) / 2) * (-0.37802-(-0.56726)));
            zz = 2.61178 + (((tickAnim - 46) / 2) * (-2.47155-(2.61178)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -8.0907 + (((tickAnim - 48) / 2) * (-7.5-(-8.0907)));
            yy = -0.37802 + (((tickAnim - 48) / 2) * (0-(-0.37802)));
            zz = -2.47155 + (((tickAnim - 48) / 2) * (0-(-2.47155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 18) / 7) * (0-(1.5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 18) * (1.5-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 43) / 7) * (0-(1.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 42.3244 + (((tickAnim - 0) / 6) * (41.25628-(42.3244)));
            yy = -3.20659 + (((tickAnim - 0) / 6) * (5.75024-(-3.20659)));
            zz = -3.33929 + (((tickAnim - 0) / 6) * (-7.10918-(-3.33929)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 41.25628 + (((tickAnim - 6) / 5) * (27.90539-(41.25628)));
            yy = 5.75024 + (((tickAnim - 6) / 5) * (-36.38108-(5.75024)));
            zz = -7.10918 + (((tickAnim - 6) / 5) * (29.12104-(-7.10918)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 27.90539 + (((tickAnim - 11) / 7) * (84.7992-(27.90539)));
            yy = -36.38108 + (((tickAnim - 11) / 7) * (-58.73722-(-36.38108)));
            zz = 29.12104 + (((tickAnim - 11) / 7) * (-57.89153-(29.12104)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 84.7992 + (((tickAnim - 18) / 3) * (55.01876-(84.7992)));
            yy = -58.73722 + (((tickAnim - 18) / 3) * (-50.14501-(-58.73722)));
            zz = -57.89153 + (((tickAnim - 18) / 3) * (-25.17582-(-57.89153)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 55.01876 + (((tickAnim - 21) / 2) * (55.91567-(55.01876)));
            yy = -50.14501 + (((tickAnim - 21) / 2) * (-47.70245-(-50.14501)));
            zz = -25.17582 + (((tickAnim - 21) / 2) * (-25.27883-(-25.17582)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 55.91567 + (((tickAnim - 23) / 2) * (41.33045-(55.91567)));
            yy = -47.70245 + (((tickAnim - 23) / 2) * (-40.58321-(-47.70245)));
            zz = -25.27883 + (((tickAnim - 23) / 2) * (-5.38304-(-25.27883)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 41.33045 + (((tickAnim - 25) / 18) * (48.79417-(41.33045)));
            yy = -40.58321 + (((tickAnim - 25) / 18) * (-12.54501-(-40.58321)));
            zz = -5.38304 + (((tickAnim - 25) / 18) * (-26.878-(-5.38304)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 48.79417 + (((tickAnim - 43) / 3) * (45.94967-(48.79417)));
            yy = -12.54501 + (((tickAnim - 43) / 3) * (-5.96163-(-12.54501)));
            zz = -26.878 + (((tickAnim - 43) / 3) * (-17.91026-(-26.878)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 45.94967 + (((tickAnim - 46) / 2) * (43.06768-(45.94967)));
            yy = -5.96163 + (((tickAnim - 46) / 2) * (-5.80535-(-5.96163)));
            zz = -17.91026 + (((tickAnim - 46) / 2) * (-6.63957-(-17.91026)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 43.06768 + (((tickAnim - 48) / 2) * (42.3244-(43.06768)));
            yy = -5.80535 + (((tickAnim - 48) / 2) * (-3.20659-(-5.80535)));
            zz = -6.63957 + (((tickAnim - 48) / 2) * (-3.33929-(-6.63957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.23365 + (((tickAnim - 0) / 3) * (44.95695-(45.23365)));
            yy = -38.88812 + (((tickAnim - 0) / 3) * (-36.03495-(-38.88812)));
            zz = -4.70804 + (((tickAnim - 0) / 3) * (-5.46743-(-4.70804)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 44.95695 + (((tickAnim - 3) / 15) * (46.64678-(44.95695)));
            yy = -36.03495 + (((tickAnim - 3) / 15) * (-19.78914-(-36.03495)));
            zz = -5.46743 + (((tickAnim - 3) / 15) * (-10.36674-(-5.46743)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 46.64678 + (((tickAnim - 18) / 3) * (46.84364-(46.64678)));
            yy = -19.78914 + (((tickAnim - 18) / 3) * (-21.64021-(-19.78914)));
            zz = -10.36674 + (((tickAnim - 18) / 3) * (-5.85599-(-10.36674)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 46.84364 + (((tickAnim - 21) / 2) * (46.31605-(46.84364)));
            yy = -21.64021 + (((tickAnim - 21) / 2) * (-19.03043-(-21.64021)));
            zz = -5.85599 + (((tickAnim - 21) / 2) * (-8.61802-(-5.85599)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 46.31605 + (((tickAnim - 23) / 2) * (45.54524-(46.31605)));
            yy = -19.03043 + (((tickAnim - 23) / 2) * (-17.74122-(-19.03043)));
            zz = -8.61802 + (((tickAnim - 23) / 2) * (1.0843-(-8.61802)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 45.54524 + (((tickAnim - 25) / 8) * (47.33779-(45.54524)));
            yy = -17.74122 + (((tickAnim - 25) / 8) * (-11.74985-(-17.74122)));
            zz = 1.0843 + (((tickAnim - 25) / 8) * (-5.62198-(1.0843)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 47.33779 + (((tickAnim - 33) / 5) * (32.2936-(47.33779)));
            yy = -11.74985 + (((tickAnim - 33) / 5) * (-12.23138-(-11.74985)));
            zz = -5.62198 + (((tickAnim - 33) / 5) * (8.5984-(-5.62198)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 32.2936 + (((tickAnim - 38) / 8) * (43.52453-(32.2936)));
            yy = -12.23138 + (((tickAnim - 38) / 8) * (-40.05098-(-12.23138)));
            zz = 8.5984 + (((tickAnim - 38) / 8) * (-15.1018-(8.5984)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 43.52453 + (((tickAnim - 46) / 2) * (45.07306-(43.52453)));
            yy = -40.05098 + (((tickAnim - 46) / 2) * (-40.53246-(-40.05098)));
            zz = -15.1018 + (((tickAnim - 46) / 2) * (-5.90867-(-15.1018)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 45.07306 + (((tickAnim - 48) / 2) * (45.23365-(45.07306)));
            yy = -40.53246 + (((tickAnim - 48) / 2) * (-38.88812-(-40.53246)));
            zz = -5.90867 + (((tickAnim - 48) / 2) * (-4.70804-(-5.90867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.31752 + (((tickAnim - 0) / 3) * (45.58139-(45.31752)));
            yy = 1.18864 + (((tickAnim - 0) / 3) * (4.36532-(1.18864)));
            zz = 4.35517 + (((tickAnim - 0) / 3) * (3.68416-(4.35517)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 45.58139 + (((tickAnim - 3) / 6) * (45.33505-(45.58139)));
            yy = 4.36532 + (((tickAnim - 3) / 6) * (9.85537-(4.36532)));
            zz = 3.68416 + (((tickAnim - 3) / 6) * (2.68633-(3.68416)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 45.33505 + (((tickAnim - 9) / 5) * (49.51861-(45.33505)));
            yy = 9.85537 + (((tickAnim - 9) / 5) * (-3.43471-(9.85537)));
            zz = 2.68633 + (((tickAnim - 9) / 5) * (16.72094-(2.68633)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 49.51861 + (((tickAnim - 14) / 8) * (37.20951-(49.51861)));
            yy = -3.43471 + (((tickAnim - 14) / 8) * (-16.63744-(-3.43471)));
            zz = 16.72094 + (((tickAnim - 14) / 8) * (-1.55925-(16.72094)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 37.20951 + (((tickAnim - 22) / 1) * (36.86644-(37.20951)));
            yy = -16.63744 + (((tickAnim - 22) / 1) * (-15.41493-(-16.63744)));
            zz = -1.55925 + (((tickAnim - 22) / 1) * (-3.44534-(-1.55925)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 36.86644 + (((tickAnim - 23) / 2) * (39.71167-(36.86644)));
            yy = -15.41493 + (((tickAnim - 23) / 2) * (-15.19567-(-15.41493)));
            zz = -3.44534 + (((tickAnim - 23) / 2) * (5.24534-(-3.44534)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 39.71167 + (((tickAnim - 25) / 18) * (39.05114-(39.71167)));
            yy = -15.19567 + (((tickAnim - 25) / 18) * (-3.87871-(-15.19567)));
            zz = 5.24534 + (((tickAnim - 25) / 18) * (-5.97464-(5.24534)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 39.05114 + (((tickAnim - 43) / 3) * (40.54902-(39.05114)));
            yy = -3.87871 + (((tickAnim - 43) / 3) * (1.1402-(-3.87871)));
            zz = -5.97464 + (((tickAnim - 43) / 3) * (-3.23505-(-5.97464)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 40.54902 + (((tickAnim - 46) / 2) * (44.7248-(40.54902)));
            yy = 1.1402 + (((tickAnim - 46) / 2) * (0.10621-(1.1402)));
            zz = -3.23505 + (((tickAnim - 46) / 2) * (4.45526-(-3.23505)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 44.7248 + (((tickAnim - 48) / 2) * (45.31752-(44.7248)));
            yy = 0.10621 + (((tickAnim - 48) / 2) * (1.18864-(0.10621)));
            zz = 4.45526 + (((tickAnim - 48) / 2) * (4.35517-(4.45526)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 50.93946 + (((tickAnim - 0) / 2) * (51.29275-(50.93946)));
            yy = -22.92077 + (((tickAnim - 0) / 2) * (-21.97266-(-22.92077)));
            zz = 5.56621 + (((tickAnim - 0) / 2) * (5.70188-(5.56621)));
        }
        else if (tickAnim >= 2 && tickAnim < 18) {
            xx = 51.29275 + (((tickAnim - 2) / 16) * (52.11405-(51.29275)));
            yy = -21.97266 + (((tickAnim - 2) / 16) * (-8.92637-(-21.97266)));
            zz = 5.70188 + (((tickAnim - 2) / 16) * (5.58709-(5.70188)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 52.11405 + (((tickAnim - 18) / 3) * (53.38417-(52.11405)));
            yy = -8.92637 + (((tickAnim - 18) / 3) * (-10.95499-(-8.92637)));
            zz = 5.58709 + (((tickAnim - 18) / 3) * (7.263-(5.58709)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 53.38417 + (((tickAnim - 21) / 2) * (49.43208-(53.38417)));
            yy = -10.95499 + (((tickAnim - 21) / 2) * (-8.44518-(-10.95499)));
            zz = 7.263 + (((tickAnim - 21) / 2) * (3.35208-(7.263)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 49.43208 + (((tickAnim - 23) / 2) * (55.74018-(49.43208)));
            yy = -8.44518 + (((tickAnim - 23) / 2) * (-8.3914-(-8.44518)));
            zz = 3.35208 + (((tickAnim - 23) / 2) * (11.30842-(3.35208)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 55.74018 + (((tickAnim - 25) / 5) * (53.60843-(55.74018)));
            yy = -8.3914 + (((tickAnim - 25) / 5) * (-4.32263-(-8.3914)));
            zz = 11.30842 + (((tickAnim - 25) / 5) * (9.24799-(11.30842)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 53.60843 + (((tickAnim - 30) / 5) * (22.57245-(53.60843)));
            yy = -4.32263 + (((tickAnim - 30) / 5) * (-14.25587-(-4.32263)));
            zz = 9.24799 + (((tickAnim - 30) / 5) * (21.43719-(9.24799)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 22.57245 + (((tickAnim - 35) / 8) * (42.66363-(22.57245)));
            yy = -14.25587 + (((tickAnim - 35) / 8) * (-24.92932-(-14.25587)));
            zz = 21.43719 + (((tickAnim - 35) / 8) * (-1.15174-(21.43719)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 42.66363 + (((tickAnim - 43) / 3) * (45.10698-(42.66363)));
            yy = -24.92932 + (((tickAnim - 43) / 3) * (-23.45605-(-24.92932)));
            zz = -1.15174 + (((tickAnim - 43) / 3) * (-0.5414-(-1.15174)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 45.10698 + (((tickAnim - 46) / 2) * (49.67549-(45.10698)));
            yy = -23.45605 + (((tickAnim - 46) / 2) * (-24.47814-(-23.45605)));
            zz = -0.5414 + (((tickAnim - 46) / 2) * (6.22351-(-0.5414)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 49.67549 + (((tickAnim - 48) / 2) * (50.93946-(49.67549)));
            yy = -24.47814 + (((tickAnim - 48) / 2) * (-22.92077-(-24.47814)));
            zz = 6.22351 + (((tickAnim - 48) / 2) * (5.56621-(6.22351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.5 + (((tickAnim - 0) / 2) * (-1-(-1.5)));
            yy = 0.83 + (((tickAnim - 0) / 2) * (2.5-(0.83)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = -1 + (((tickAnim - 2) / 10) * (-2.5-(-1)));
            yy = 2.5 + (((tickAnim - 2) / 10) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -2.5 + (((tickAnim - 12) / 10) * (-3-(-2.5)));
            yy = 2.5 + (((tickAnim - 12) / 10) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -3 + (((tickAnim - 22) / 5) * (-1-(-3)));
            yy = 2.5 + (((tickAnim - 22) / 5) * (-2.5-(2.5)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -1 + (((tickAnim - 27) / 10) * (-2.5-(-1)));
            yy = -2.5 + (((tickAnim - 27) / 10) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
            xx = -2.5 + (((tickAnim - 37) / 10) * (-3-(-2.5)));
            yy = -2.5 + (((tickAnim - 37) / 10) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 37) / 10) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 47) / 3) * (-1.5-(-3)));
            yy = -2.5 + (((tickAnim - 47) / 3) * (0.83-(-2.5)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
            yy = 0.83 + (((tickAnim - 0) / 3) * (-2.5-(0.83)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 3) / 20) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 3) / 20) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 20) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.5 + (((tickAnim - 23) / 5) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 23) / 5) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 2.5 + (((tickAnim - 28) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 28) / 20) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 48) / 2) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 48) / 2) * (0.83-(2.5)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 0) / 5) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 0) / 5) * (0-(2.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 5) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 5) / 20) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 25) / 5) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 25) / 5) * (2.5-(-2.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 30) / 20) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.5 + (((tickAnim - 0) / 2) * (2.5-(2.5)));
            yy = -2.29 + (((tickAnim - 0) / 2) * (-2.5-(-2.29)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 2) / 5) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 2) / 5) * (2.5-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 7) / 20) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 7) / 20) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 7) / 20) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 2.5 + (((tickAnim - 27) / 5) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 27) / 5) * (0-(2.5)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 32) / 18) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (-2.29-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 0) / 3) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 3) / 5) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 3) / 5) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = 2.5 + (((tickAnim - 8) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 20) * (2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 20) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 28) / 5) * (2.5-(2.5)));
            yy = 2.5 + (((tickAnim - 28) / 5) * (-2.5-(2.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 33) / 17) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 33) / 17) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 0) / 12) * (25-(22.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 12) / 11) * (22.5-(25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 23) / 2) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 22.5 + (((tickAnim - 25) / 12) * (25-(22.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 25 + (((tickAnim - 37) / 11) * (22.5-(25)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 48) / 2) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 97.5 + (((tickAnim - 0) / 12) * (100-(97.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 100 + (((tickAnim - 12) / 11) * (97.5-(100)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 97.5 + (((tickAnim - 23) / 2) * (97.5-(97.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 97.5 + (((tickAnim - 25) / 12) * (100-(97.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 100 + (((tickAnim - 37) / 11) * (97.5-(100)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 97.5 + (((tickAnim - 48) / 2) * (97.5-(97.5)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 95 + (((tickAnim - 0) / 12) * (97.5-(95)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 97.5 + (((tickAnim - 12) / 11) * (95-(97.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 95 + (((tickAnim - 23) / 2) * (95-(95)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 95 + (((tickAnim - 25) / 12) * (97.5-(95)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 97.5 + (((tickAnim - 37) / 11) * (95-(97.5)));
            yy = 0 + (((tickAnim - 37) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 11) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 95 + (((tickAnim - 48) / 2) * (95-(95)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 23.845 + (((tickAnim - 0) / 12) * (22.40745-(23.845)));
            yy = -29.54497 + (((tickAnim - 0) / 12) * (-36.51108-(-29.54497)));
            zz = 20.4761 + (((tickAnim - 0) / 12) * (25.76676-(20.4761)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 22.40745 + (((tickAnim - 12) / 8) * (24.55388-(22.40745)));
            yy = -36.51108 + (((tickAnim - 12) / 8) * (-36.38768-(-36.51108)));
            zz = 25.76676 + (((tickAnim - 12) / 8) * (17.32315-(25.76676)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 24.55388 + (((tickAnim - 20) / 2) * (23.08739-(24.55388)));
            yy = -36.38768 + (((tickAnim - 20) / 2) * (-29.85032-(-36.38768)));
            zz = 17.32315 + (((tickAnim - 20) / 2) * (6.69781-(17.32315)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 23.08739 + (((tickAnim - 22) / 2) * (22.22304-(23.08739)));
            yy = -29.85032 + (((tickAnim - 22) / 2) * (-26.85251-(-29.85032)));
            zz = 6.69781 + (((tickAnim - 22) / 2) * (13.64739-(6.69781)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 22.22304 + (((tickAnim - 24) / 7) * (22.82305-(22.22304)));
            yy = -26.85251 + (((tickAnim - 24) / 7) * (-27.7433-(-26.85251)));
            zz = 13.64739 + (((tickAnim - 24) / 7) * (22.6408-(13.64739)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 22.82305 + (((tickAnim - 31) / 12) * (23.845-(22.82305)));
            yy = -27.7433 + (((tickAnim - 31) / 12) * (-29.54497-(-27.7433)));
            zz = 22.6408 + (((tickAnim - 31) / 12) * (20.4761-(22.6408)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 23.845 + (((tickAnim - 43) / 1) * (24.52873-(23.845)));
            yy = -29.54497 + (((tickAnim - 43) / 1) * (-27.49529-(-29.54497)));
            zz = 20.4761 + (((tickAnim - 43) / 1) * (15.86435-(20.4761)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 24.52873 + (((tickAnim - 44) / 3) * (21.87959-(24.52873)));
            yy = -27.49529 + (((tickAnim - 44) / 3) * (-19.57337-(-27.49529)));
            zz = 15.86435 + (((tickAnim - 44) / 3) * (22.01547-(15.86435)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 21.87959 + (((tickAnim - 47) / 3) * (23.845-(21.87959)));
            yy = -19.57337 + (((tickAnim - 47) / 3) * (-29.54497-(-19.57337)));
            zz = 22.01547 + (((tickAnim - 47) / 3) * (20.4761-(22.01547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -17.5 + (((tickAnim - 0) / 12) * (-22.5-(-17.5)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = -22.5 + (((tickAnim - 12) / 11) * (-22.08-(-22.5)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -22.08 + (((tickAnim - 23) / 10) * (-17.05-(-22.08)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            yy = -17.05 + (((tickAnim - 33) / 13) * (-14.46-(-17.05)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -14.46 + (((tickAnim - 46) / 4) * (-17.5-(-14.46)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -25 + (((tickAnim - 0) / 17) * (-10-(-25)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -10 + (((tickAnim - 17) / 6) * (-21.18-(-10)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = -21.18 + (((tickAnim - 23) / 15) * (-27.61-(-21.18)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -27.61 + (((tickAnim - 38) / 8) * (-31.11-(-27.61)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -31.11 + (((tickAnim - 46) / 4) * (-25-(-31.11)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(20), clawR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(-20), clawL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 22.54431 + (((tickAnim - 0) / 11) * (22.52793-(22.54431)));
            yy = 29.0121 + (((tickAnim - 0) / 11) * (24.31231-(29.0121)));
            zz = -27.42945 + (((tickAnim - 0) / 11) * (-17.70265-(-27.42945)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 22.52793 + (((tickAnim - 11) / 9) * (23.845-(22.52793)));
            yy = 24.31231 + (((tickAnim - 11) / 9) * (29.54497-(24.31231)));
            zz = -17.70265 + (((tickAnim - 11) / 9) * (-20.4761-(-17.70265)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 23.845 + (((tickAnim - 20) / 2) * (24.88872-(23.845)));
            yy = 29.54497 + (((tickAnim - 20) / 2) * (32.03803-(29.54497)));
            zz = -20.4761 + (((tickAnim - 20) / 2) * (-13.74414-(-20.4761)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 24.88872 + (((tickAnim - 22) / 2) * (22.5417-(24.88872)));
            yy = 32.03803 + (((tickAnim - 22) / 2) * (26.79208-(32.03803)));
            zz = -13.74414 + (((tickAnim - 22) / 2) * (-13.66573-(-13.74414)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 22.5417 + (((tickAnim - 24) / 9) * (22.86193-(22.5417)));
            yy = 26.79208 + (((tickAnim - 24) / 9) * (31.52368-(26.79208)));
            zz = -13.66573 + (((tickAnim - 24) / 9) * (-25.10763-(-13.66573)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 22.86193 + (((tickAnim - 33) / 10) * (24.03649-(22.86193)));
            yy = 31.52368 + (((tickAnim - 33) / 10) * (31.82995-(31.52368)));
            zz = -25.10763 + (((tickAnim - 33) / 10) * (-19.44378-(-25.10763)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 24.03649 + (((tickAnim - 43) / 1) * (22.32642-(24.03649)));
            yy = 31.82995 + (((tickAnim - 43) / 1) * (27.16664-(31.82995)));
            zz = -19.44378 + (((tickAnim - 43) / 1) * (-13.30843-(-19.44378)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 22.32642 + (((tickAnim - 44) / 3) * (21.96447-(22.32642)));
            yy = 27.16664 + (((tickAnim - 44) / 3) * (23.15844-(27.16664)));
            zz = -13.30843 + (((tickAnim - 44) / 3) * (-17.858-(-13.30843)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 21.96447 + (((tickAnim - 47) / 3) * (22.54431-(21.96447)));
            yy = 23.15844 + (((tickAnim - 47) / 3) * (29.0121-(23.15844)));
            zz = -17.858 + (((tickAnim - 47) / 3) * (-27.42945-(-17.858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 17.5 + (((tickAnim - 0) / 13) * (30-(17.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 30 + (((tickAnim - 13) / 9) * (26.43-(30)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 22) / 16) * (0-(0)));
            yy = 26.43 + (((tickAnim - 22) / 16) * (16.19-(26.43)));
            zz = 0 + (((tickAnim - 22) / 16) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 16.19 + (((tickAnim - 38) / 7) * (18.66-(16.19)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 18.66 + (((tickAnim - 45) / 5) * (17.5-(18.66)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 16) * (15-(25)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 15 + (((tickAnim - 16) / 6) * (20.73-(15)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 22) / 20) * (0-(0)));
            yy = 20.73 + (((tickAnim - 22) / 20) * (20.45-(20.73)));
            zz = 0 + (((tickAnim - 22) / 20) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 20.45 + (((tickAnim - 42) / 3) * (27.68-(20.45)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 27.68 + (((tickAnim - 45) / 5) * (25-(27.68)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 42.1937 + (((tickAnim - 0) / 18) * (49.97195-(42.1937)));
            yy = 37.40408 + (((tickAnim - 0) / 18) * (14.80042-(37.40408)));
            zz = 8.8012 + (((tickAnim - 0) / 18) * (28.5078-(8.8012)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 49.97195 + (((tickAnim - 18) / 3) * (47.3727-(49.97195)));
            yy = 14.80042 + (((tickAnim - 18) / 3) * (9.55465-(14.80042)));
            zz = 28.5078 + (((tickAnim - 18) / 3) * (19.34462-(28.5078)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 47.3727 + (((tickAnim - 21) / 2) * (44.19783-(47.3727)));
            yy = 9.55465 + (((tickAnim - 21) / 2) * (7.46831-(9.55465)));
            zz = 19.34462 + (((tickAnim - 21) / 2) * (7.35874-(19.34462)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 44.19783 + (((tickAnim - 23) / 1) * (43.49471-(44.19783)));
            yy = 7.46831 + (((tickAnim - 23) / 1) * (4.94694-(7.46831)));
            zz = 7.35874 + (((tickAnim - 23) / 1) * (7.32151-(7.35874)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 43.49471 + (((tickAnim - 24) / 6) * (41.08468-(43.49471)));
            yy = 4.94694 + (((tickAnim - 24) / 6) * (-5.15351-(4.94694)));
            zz = 7.32151 + (((tickAnim - 24) / 6) * (9.24658-(7.32151)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 41.08468 + (((tickAnim - 30) / 5) * (29.53301-(41.08468)));
            yy = -5.15351 + (((tickAnim - 30) / 5) * (34.29906-(-5.15351)));
            zz = 9.24658 + (((tickAnim - 30) / 5) * (-28.57045-(9.24658)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 29.53301 + (((tickAnim - 35) / 8) * (84.7992-(29.53301)));
            yy = 34.29906 + (((tickAnim - 35) / 8) * (58.73722-(34.29906)));
            zz = -28.57045 + (((tickAnim - 35) / 8) * (57.89153-(-28.57045)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 84.7992 + (((tickAnim - 43) / 3) * (55.56489-(84.7992)));
            yy = 58.73722 + (((tickAnim - 43) / 3) * (49.3217-(58.73722)));
            zz = 57.89153 + (((tickAnim - 43) / 3) * (23.91897-(57.89153)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 55.56489 + (((tickAnim - 46) / 2) * (54.68933-(55.56489)));
            yy = 49.3217 + (((tickAnim - 46) / 2) * (46.62456-(49.3217)));
            zz = 23.91897 + (((tickAnim - 46) / 2) * (22.8389-(23.91897)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 54.68933 + (((tickAnim - 48) / 2) * (42.1937-(54.68933)));
            yy = 46.62456 + (((tickAnim - 48) / 2) * (37.40408-(46.62456)));
            zz = 22.8389 + (((tickAnim - 48) / 2) * (8.8012-(22.8389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 45.76716 + (((tickAnim - 0) / 9) * (44.28749-(45.76716)));
            yy = 6.04381 + (((tickAnim - 0) / 9) * (-2.12775-(6.04381)));
            zz = 0.26455 + (((tickAnim - 0) / 9) * (6.00182-(0.26455)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 44.28749 + (((tickAnim - 9) / 8) * (33.5953-(44.28749)));
            yy = -2.12775 + (((tickAnim - 9) / 8) * (23.81752-(-2.12775)));
            zz = 6.00182 + (((tickAnim - 9) / 8) * (-8.59842-(6.00182)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 33.5953 + (((tickAnim - 17) / 6) * (40.36243-(33.5953)));
            yy = 23.81752 + (((tickAnim - 17) / 6) * (27.8481-(23.81752)));
            zz = -8.59842 + (((tickAnim - 17) / 6) * (3.59278-(-8.59842)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 40.36243 + (((tickAnim - 23) / 2) * (41.95877-(40.36243)));
            yy = 27.8481 + (((tickAnim - 23) / 2) * (25.57525-(27.8481)));
            zz = 3.59278 + (((tickAnim - 23) / 2) * (5.60104-(3.59278)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 41.95877 + (((tickAnim - 25) / 4) * (43.47314-(41.95877)));
            yy = 25.57525 + (((tickAnim - 25) / 4) * (21.51468-(25.57525)));
            zz = 5.60104 + (((tickAnim - 25) / 4) * (6.81724-(5.60104)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 43.47314 + (((tickAnim - 29) / 14) * (43.63682-(43.47314)));
            yy = 21.51468 + (((tickAnim - 29) / 14) * (8.66046-(21.51468)));
            zz = 6.81724 + (((tickAnim - 29) / 14) * (9.27087-(6.81724)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 43.63682 + (((tickAnim - 43) / 3) * (45.3295-(43.63682)));
            yy = 8.66046 + (((tickAnim - 43) / 3) * (9.70399-(8.66046)));
            zz = 9.27087 + (((tickAnim - 43) / 3) * (3.51988-(9.27087)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 45.3295 + (((tickAnim - 46) / 2) * (44.43339-(45.3295)));
            yy = 9.70399 + (((tickAnim - 46) / 2) * (7.15014-(9.70399)));
            zz = 3.51988 + (((tickAnim - 46) / 2) * (7.18951-(3.51988)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 44.43339 + (((tickAnim - 48) / 2) * (45.76716-(44.43339)));
            yy = 7.15014 + (((tickAnim - 48) / 2) * (6.04381-(7.15014)));
            zz = 7.18951 + (((tickAnim - 48) / 2) * (0.26455-(7.18951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 38.97692 + (((tickAnim - 0) / 18) * (38.8644-(38.97692)));
            yy = 14.15233 + (((tickAnim - 0) / 18) * (1.76483-(14.15233)));
            zz = -1.93669 + (((tickAnim - 0) / 18) * (6.75467-(-1.93669)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 38.8644 + (((tickAnim - 18) / 3) * (40.36129-(38.8644)));
            yy = 1.76483 + (((tickAnim - 18) / 3) * (-1.27685-(1.76483)));
            zz = 6.75467 + (((tickAnim - 18) / 3) * (4.10473-(6.75467)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 40.36129 + (((tickAnim - 21) / 2) * (44.87901-(40.36129)));
            yy = -1.27685 + (((tickAnim - 21) / 2) * (-0.61648-(-1.27685)));
            zz = 4.10473 + (((tickAnim - 21) / 2) * (-4.27178-(4.10473)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 44.87901 + (((tickAnim - 23) / 2) * (44.09852-(44.87901)));
            yy = -0.61648 + (((tickAnim - 23) / 2) * (-2.25494-(-0.61648)));
            zz = -4.27178 + (((tickAnim - 23) / 2) * (-1.61987-(-4.27178)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 44.09852 + (((tickAnim - 25) / 3) * (44.36713-(44.09852)));
            yy = -2.25494 + (((tickAnim - 25) / 3) * (-4.63398-(-2.25494)));
            zz = -1.61987 + (((tickAnim - 25) / 3) * (-1.36419-(-1.61987)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 44.36713 + (((tickAnim - 28) / 5) * (44.42662-(44.36713)));
            yy = -4.63398 + (((tickAnim - 28) / 5) * (-10.35732-(-4.63398)));
            zz = -1.36419 + (((tickAnim - 28) / 5) * (-1.40694-(-1.36419)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 44.42662 + (((tickAnim - 33) / 5) * (49.51861-(44.42662)));
            yy = -10.35732 + (((tickAnim - 33) / 5) * (3.43471-(-10.35732)));
            zz = -1.40694 + (((tickAnim - 33) / 5) * (-16.72094-(-1.40694)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 49.51861 + (((tickAnim - 38) / 8) * (37.71929-(49.51861)));
            yy = 3.43471 + (((tickAnim - 38) / 8) * (17.14108-(3.43471)));
            zz = -16.72094 + (((tickAnim - 38) / 8) * (-0.44691-(-16.72094)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 37.71929 + (((tickAnim - 46) / 2) * (37.16719-(37.71929)));
            yy = 17.14108 + (((tickAnim - 46) / 2) * (15.4629-(17.14108)));
            zz = -0.44691 + (((tickAnim - 46) / 2) * (3.06102-(-0.44691)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 37.16719 + (((tickAnim - 48) / 2) * (38.97692-(37.16719)));
            yy = 15.4629 + (((tickAnim - 48) / 2) * (14.15233-(15.4629)));
            zz = 3.06102 + (((tickAnim - 48) / 2) * (-1.93669-(3.06102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 53.28641 + (((tickAnim - 0) / 6) * (51.73779-(53.28641)));
            yy = 6.94035 + (((tickAnim - 0) / 6) * (2.453-(6.94035)));
            zz = -8.8582 + (((tickAnim - 0) / 6) * (-7.36148-(-8.8582)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 51.73779 + (((tickAnim - 6) / 5) * (23.35404-(51.73779)));
            yy = 2.453 + (((tickAnim - 6) / 5) * (11.82687-(2.453)));
            zz = -7.36148 + (((tickAnim - 6) / 5) * (-22.27028-(-7.36148)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 23.35404 + (((tickAnim - 11) / 7) * (42.36004-(23.35404)));
            yy = 11.82687 + (((tickAnim - 11) / 7) * (26.29034-(11.82687)));
            zz = -22.27028 + (((tickAnim - 11) / 7) * (2.04314-(-22.27028)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 42.36004 + (((tickAnim - 18) / 3) * (44.27286-(42.36004)));
            yy = 26.29034 + (((tickAnim - 18) / 3) * (22.93627-(26.29034)));
            zz = 2.04314 + (((tickAnim - 18) / 3) * (0.43945-(2.04314)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 44.27286 + (((tickAnim - 21) / 2) * (48.97073-(44.27286)));
            yy = 22.93627 + (((tickAnim - 21) / 2) * (23.71018-(22.93627)));
            zz = 0.43945 + (((tickAnim - 21) / 2) * (-6.11683-(0.43945)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 48.97073 + (((tickAnim - 23) / 2) * (49.59621-(48.97073)));
            yy = 23.71018 + (((tickAnim - 23) / 2) * (22.14121-(23.71018)));
            zz = -6.11683 + (((tickAnim - 23) / 2) * (-3.06441-(-6.11683)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 49.59621 + (((tickAnim - 25) / 18) * (51.41618-(49.59621)));
            yy = 22.14121 + (((tickAnim - 25) / 18) * (8.59462-(22.14121)));
            zz = -3.06441 + (((tickAnim - 25) / 18) * (-4.81019-(-3.06441)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 51.41618 + (((tickAnim - 43) / 3) * (53.95601-(51.41618)));
            yy = 8.59462 + (((tickAnim - 43) / 3) * (10.37918-(8.59462)));
            zz = -4.81019 + (((tickAnim - 43) / 3) * (-8.08501-(-4.81019)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 53.95601 + (((tickAnim - 46) / 2) * (49.53598-(53.95601)));
            yy = 10.37918 + (((tickAnim - 46) / 2) * (7.88835-(10.37918)));
            zz = -8.08501 + (((tickAnim - 46) / 2) * (-3.59368-(-8.08501)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 49.53598 + (((tickAnim - 48) / 2) * (53.28641-(49.53598)));
            yy = 7.88835 + (((tickAnim - 48) / 2) * (6.94035-(7.88835)));
            zz = -3.59368 + (((tickAnim - 48) / 2) * (-8.8582-(-3.59368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttackEramo(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEramoscorpius entity = (EntityPrehistoricFloraEramoscorpius) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (48.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 48.5 + (((tickAnim - 3) / 2) * (80-(48.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 80 + (((tickAnim - 5) / 3) * (51.41495-(80)));
            yy = 0 + (((tickAnim - 5) / 3) * (2.0123-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (1.48377-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 51.41495 + (((tickAnim - 8) / 2) * (27.5-(51.41495)));
            yy = 2.0123 + (((tickAnim - 8) / 2) * (0-(2.0123)));
            zz = 1.48377 + (((tickAnim - 8) / 2) * (0-(1.48377)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 10) / 5) * (0-(27.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 0) / 3) * (-19.9-(-4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -19.9 + (((tickAnim - 3) / 1) * (7.57-(-19.9)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 7.57 + (((tickAnim - 4) / 1) * (47.5-(7.57)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 47.5 + (((tickAnim - 5) / 2) * (24.5-(47.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 24.5 + (((tickAnim - 7) / 3) * (28.19-(24.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 28.19 + (((tickAnim - 10) / 5) * (-4-(28.19)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (0.49952-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.02181-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.4999-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.49952 + (((tickAnim - 4) / 1) * (12.5-(0.49952)));
            yy = 0.02181 + (((tickAnim - 4) / 1) * (0-(0.02181)));
            zz = -2.4999 + (((tickAnim - 4) / 1) * (0-(-2.4999)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 5) / 2) * (19.73013-(12.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.95159-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (2.33238-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 19.73013 + (((tickAnim - 7) / 8) * (-5-(19.73013)));
            yy = -0.95159 + (((tickAnim - 7) / 8) * (0-(-0.95159)));
            zz = 2.33238 + (((tickAnim - 7) / 8) * (0-(2.33238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.92-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.92 + (((tickAnim - 4) / 1) * (1.1-(0.92)));
            zz = 0.2 + (((tickAnim - 4) / 1) * (0.3-(0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 1.1 + (((tickAnim - 5) / 10) * (0-(1.1)));
            zz = 0.3 + (((tickAnim - 5) / 10) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 0) / 3) * (-16-(-1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -16 + (((tickAnim - 3) / 1) * (19.83-(-16)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.83 + (((tickAnim - 4) / 1) * (36.5-(19.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 36.5 + (((tickAnim - 5) / 2) * (29.53-(36.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 29.53 + (((tickAnim - 7) / 8) * (-1-(29.53)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6 + (((tickAnim - 0) / 3) * (15-(6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 3) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 4) / 1) * (22.5-(20)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 5) / 2) * (47.5-(22.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 47.5 + (((tickAnim - 7) / 3) * (24.69-(47.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.69 + (((tickAnim - 10) / 5) * (6-(24.69)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4 + (((tickAnim - 0) / 3) * (27-(4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 27 + (((tickAnim - 3) / 1) * (36.33-(27)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 36.33 + (((tickAnim - 4) / 1) * (15-(36.33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15 + (((tickAnim - 5) / 2) * (18.16-(15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 18.16 + (((tickAnim - 7) / 3) * (48.41-(18.16)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 48.41 + (((tickAnim - 10) / 5) * (4-(48.41)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.5 + (((tickAnim - 0) / 3) * (15-(25.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 3) / 1) * (31.83-(15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 31.83 + (((tickAnim - 4) / 1) * (8-(31.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 8 + (((tickAnim - 5) / 2) * (15.63-(8)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 15.63 + (((tickAnim - 7) / 3) * (21.03-(15.63)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.03 + (((tickAnim - 10) / 5) * (25.5-(21.03)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99 + (((tickAnim - 0) / 3) * (59-(99)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 59 + (((tickAnim - 3) / 1) * (42.33-(59)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 42.33 + (((tickAnim - 4) / 1) * (9-(42.33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 9 + (((tickAnim - 5) / 2) * (15.45-(9)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 15.45 + (((tickAnim - 7) / 3) * (11.7-(15.45)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.7 + (((tickAnim - 10) / 5) * (99-(11.7)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99.5 + (((tickAnim - 0) / 3) * (61-(99.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 61 + (((tickAnim - 3) / 1) * (7.17-(61)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 7.17 + (((tickAnim - 4) / 1) * (19.5-(7.17)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 19.5 + (((tickAnim - 5) / 2) * (5.29-(19.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5.29 + (((tickAnim - 7) / 3) * (6.69-(5.29)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.69 + (((tickAnim - 10) / 5) * (99.5-(6.69)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.93026 + (((tickAnim - 0) / 3) * (5.18211-(4.93026)));
            yy = 41.92217 + (((tickAnim - 0) / 3) * (-21.83882-(41.92217)));
            zz = 22.02632 + (((tickAnim - 0) / 3) * (17.74173-(22.02632)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5.18211 + (((tickAnim - 3) / 0) * (2.91706-(5.18211)));
            yy = -21.83882 + (((tickAnim - 3) / 0) * (-59.04901-(-21.83882)));
            zz = 17.74173 + (((tickAnim - 3) / 0) * (15.8248-(17.74173)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.91706 + (((tickAnim - 3) / 3) * (-24.97115-(2.91706)));
            yy = -59.04901 + (((tickAnim - 3) / 3) * (-53.52992-(-59.04901)));
            zz = 15.8248 + (((tickAnim - 3) / 3) * (31.42315-(15.8248)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -24.97115 + (((tickAnim - 6) / 4) * (-18.62069-(-24.97115)));
            yy = -53.52992 + (((tickAnim - 6) / 4) * (-45.81785-(-53.52992)));
            zz = 31.42315 + (((tickAnim - 6) / 4) * (16.53184-(31.42315)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -18.62069 + (((tickAnim - 10) / 5) * (4.93026-(-18.62069)));
            yy = -45.81785 + (((tickAnim - 10) / 5) * (41.92217-(-45.81785)));
            zz = 16.53184 + (((tickAnim - 10) / 5) * (22.02632-(16.53184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -60 + (((tickAnim - 0) / 1) * (8.88-(-60)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 8.88 + (((tickAnim - 1) / 2) * (-14.22-(8.88)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = -14.22 + (((tickAnim - 3) / 9) * (-7.62-(-14.22)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -7.62 + (((tickAnim - 12) / 3) * (-60-(-7.62)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -67.5 + (((tickAnim - 0) / 3) * (-5.66-(-67.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -5.66 + (((tickAnim - 3) / 1) * (-4.22-(-5.66)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -4.22 + (((tickAnim - 4) / 6) * (-36.84-(-4.22)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -36.84 + (((tickAnim - 10) / 3) * (-27.57-(-36.84)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -27.57 + (((tickAnim - 13) / 2) * (-67.5-(-27.57)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 0) / 2) * (-32.5-(17.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -32.5 + (((tickAnim - 2) / 1) * (17.5-(-32.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 17.5 + (((tickAnim - 3) / 12) * (17.5-(17.5)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(xx), clawR.rotateAngleY + (float) Math.toRadians(yy), clawR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.93026 + (((tickAnim - 0) / 3) * (4.87094-(4.93026)));
            yy = -41.92217 + (((tickAnim - 0) / 3) * (32.19226-(-41.92217)));
            zz = -22.02632 + (((tickAnim - 0) / 3) * (-16.43064-(-22.02632)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4.87094 + (((tickAnim - 3) / 1) * (2.91706-(4.87094)));
            yy = 32.19226 + (((tickAnim - 3) / 1) * (59.04901-(32.19226)));
            zz = -16.43064 + (((tickAnim - 3) / 1) * (-15.8248-(-16.43064)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2.91706 + (((tickAnim - 4) / 3) * (-29.02969-(2.91706)));
            yy = 59.04901 + (((tickAnim - 4) / 3) * (43.61055-(59.04901)));
            zz = -15.8248 + (((tickAnim - 4) / 3) * (-30.44257-(-15.8248)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -29.02969 + (((tickAnim - 7) / 4) * (-14.04422-(-29.02969)));
            yy = 43.61055 + (((tickAnim - 7) / 4) * (34.63984-(43.61055)));
            zz = -30.44257 + (((tickAnim - 7) / 4) * (-24.77166-(-30.44257)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -14.04422 + (((tickAnim - 11) / 4) * (4.93026-(-14.04422)));
            yy = 34.63984 + (((tickAnim - 11) / 4) * (-41.92217-(34.63984)));
            zz = -24.77166 + (((tickAnim - 11) / 4) * (-22.02632-(-24.77166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 60 + (((tickAnim - 0) / 1) * (-12.15-(60)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -12.15 + (((tickAnim - 1) / 2) * (11.72-(-12.15)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 11.72 + (((tickAnim - 3) / 7) * (0.99-(11.72)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.99 + (((tickAnim - 10) / 5) * (60-(0.99)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 67.5 + (((tickAnim - 0) / 2) * (5.16-(67.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 5.16 + (((tickAnim - 2) / 1) * (11.72-(5.16)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 11.72 + (((tickAnim - 3) / 5) * (42.86-(11.72)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 42.86 + (((tickAnim - 8) / 5) * (39.5-(42.86)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 39.5 + (((tickAnim - 13) / 2) * (67.5-(39.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 0) / 2) * (27.5-(-17.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 27.5 + (((tickAnim - 2) / 1) * (-17.5-(27.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = -17.5 + (((tickAnim - 3) / 12) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(xx), clawL.rotateAngleY + (float) Math.toRadians(yy), clawL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.13823 + (((tickAnim - 0) / 4) * (-0.13823-(-0.13823)));
            yy = 18.4199 + (((tickAnim - 0) / 4) * (18.4199-(18.4199)));
            zz = -5.00175 + (((tickAnim - 0) / 4) * (-5.00175-(-5.00175)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.13823 + (((tickAnim - 4) / 1) * (-0.04904-(-0.13823)));
            yy = 18.4199 + (((tickAnim - 4) / 1) * (19.87763-(18.4199)));
            zz = -5.00175 + (((tickAnim - 4) / 1) * (1.61786-(-5.00175)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.04904 + (((tickAnim - 5) / 2) * (0.43981-(-0.04904)));
            yy = 19.87763 + (((tickAnim - 5) / 2) * (22.17756-(19.87763)));
            zz = 1.61786 + (((tickAnim - 5) / 2) * (5.79085-(1.61786)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0.43981 + (((tickAnim - 7) / 8) * (-0.13823-(0.43981)));
            yy = 22.17756 + (((tickAnim - 7) / 8) * (18.4199-(22.17756)));
            zz = 5.79085 + (((tickAnim - 7) / 8) * (-5.00175-(5.79085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.84693 + (((tickAnim - 0) / 4) * (-7.24565-(-2.84693)));
            yy = 12.38438 + (((tickAnim - 0) / 4) * (11.93894-(12.38438)));
            zz = -0.64684 + (((tickAnim - 0) / 4) * (-2.98917-(-0.64684)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.24565 + (((tickAnim - 4) / 1) * (-12.23662-(-7.24565)));
            yy = 11.93894 + (((tickAnim - 4) / 1) * (11.5964-(11.93894)));
            zz = -2.98917 + (((tickAnim - 4) / 1) * (-5.62942-(-2.98917)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -12.23662 + (((tickAnim - 5) / 2) * (-14.04235-(-12.23662)));
            yy = 11.5964 + (((tickAnim - 5) / 2) * (11.78545-(11.5964)));
            zz = -5.62942 + (((tickAnim - 5) / 2) * (-6.58936-(-5.62942)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -14.04235 + (((tickAnim - 7) / 8) * (-2.84693-(-14.04235)));
            yy = 11.78545 + (((tickAnim - 7) / 8) * (12.38438-(11.78545)));
            zz = -6.58936 + (((tickAnim - 7) / 8) * (-0.64684-(-6.58936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.22177 + (((tickAnim - 0) / 4) * (-6.25702-(2.22177)));
            yy = 19.88953 + (((tickAnim - 0) / 4) * (19.46493-(19.88953)));
            zz = 3.81745 + (((tickAnim - 0) / 4) * (-2.65186-(3.81745)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6.25702 + (((tickAnim - 4) / 1) * (-21.57732-(-6.25702)));
            yy = 19.46493 + (((tickAnim - 4) / 1) * (17.7408-(19.46493)));
            zz = -2.65186 + (((tickAnim - 4) / 1) * (-14.20855-(-2.65186)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -21.57732 + (((tickAnim - 5) / 2) * (-29.29706-(-21.57732)));
            yy = 17.7408 + (((tickAnim - 5) / 2) * (16.84657-(17.7408)));
            zz = -14.20855 + (((tickAnim - 5) / 2) * (-19.97227-(-14.20855)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -29.29706 + (((tickAnim - 7) / 8) * (2.22177-(-29.29706)));
            yy = 16.84657 + (((tickAnim - 7) / 8) * (19.88953-(16.84657)));
            zz = -19.97227 + (((tickAnim - 7) / 8) * (3.81745-(-19.97227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.54586 + (((tickAnim - 0) / 4) * (6.17309-(25.54586)));
            yy = 14.5477 + (((tickAnim - 0) / 4) * (14.49252-(14.5477)));
            zz = 13.6227 + (((tickAnim - 0) / 4) * (-4.54671-(13.6227)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.17309 + (((tickAnim - 4) / 1) * (-23.59841-(6.17309)));
            yy = 14.49252 + (((tickAnim - 4) / 1) * (10.35468-(14.49252)));
            zz = -4.54671 + (((tickAnim - 4) / 1) * (-32.19275-(-4.54671)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -23.59841 + (((tickAnim - 5) / 2) * (-36.32083-(-23.59841)));
            yy = 10.35468 + (((tickAnim - 5) / 2) * (6.96384-(10.35468)));
            zz = -32.19275 + (((tickAnim - 5) / 2) * (-43.74127-(-32.19275)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -36.32083 + (((tickAnim - 7) / 4) * (-10.47328-(-36.32083)));
            yy = 6.96384 + (((tickAnim - 7) / 4) * (13.49558-(6.96384)));
            zz = -43.74127 + (((tickAnim - 7) / 4) * (-20.07849-(-43.74127)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.47328 + (((tickAnim - 11) / 2) * (10.38189-(-10.47328)));
            yy = 13.49558 + (((tickAnim - 11) / 2) * (14.96118-(13.49558)));
            zz = -20.07849 + (((tickAnim - 11) / 2) * (-0.59694-(-20.07849)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10.38189 + (((tickAnim - 13) / 2) * (25.54586-(10.38189)));
            yy = 14.96118 + (((tickAnim - 13) / 2) * (14.5477-(14.96118)));
            zz = -0.59694 + (((tickAnim - 13) / 2) * (13.6227-(-0.59694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.13823 + (((tickAnim - 0) / 4) * (-0.1376-(-0.13823)));
            yy = -18.4199 + (((tickAnim - 0) / 4) * (-18.36539-(-18.4199)));
            zz = 5.00175 + (((tickAnim - 0) / 4) * (11.25132-(5.00175)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.1376 + (((tickAnim - 4) / 1) * (2.28531-(-0.1376)));
            yy = -18.36539 + (((tickAnim - 4) / 1) * (-22.05233-(-18.36539)));
            zz = 11.25132 + (((tickAnim - 4) / 1) * (-1.99374-(11.25132)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.28531 + (((tickAnim - 5) / 2) * (0.44986-(2.28531)));
            yy = -22.05233 + (((tickAnim - 5) / 2) * (-24.20421-(-22.05233)));
            zz = -1.99374 + (((tickAnim - 5) / 2) * (-11.46129-(-1.99374)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0.44986 + (((tickAnim - 7) / 8) * (-0.13823-(0.44986)));
            yy = -24.20421 + (((tickAnim - 7) / 8) * (-18.4199-(-24.20421)));
            zz = -11.46129 + (((tickAnim - 7) / 8) * (5.00175-(-11.46129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.84693 + (((tickAnim - 0) / 4) * (-23.84585-(-2.84693)));
            yy = -12.38438 + (((tickAnim - 0) / 4) * (-10.42676-(-12.38438)));
            zz = 0.64684 + (((tickAnim - 0) / 4) * (11.68076-(0.64684)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -23.84585 + (((tickAnim - 4) / 1) * (-12.81729-(-23.84585)));
            yy = -10.42676 + (((tickAnim - 4) / 1) * (-11.52438-(-10.42676)));
            zz = 11.68076 + (((tickAnim - 4) / 1) * (5.93335-(11.68076)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -12.81729 + (((tickAnim - 5) / 2) * (-1.07661-(-12.81729)));
            yy = -11.52438 + (((tickAnim - 5) / 2) * (-12.52-(-11.52438)));
            zz = 5.93335 + (((tickAnim - 5) / 2) * (-0.30598-(5.93335)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -1.07661 + (((tickAnim - 7) / 8) * (-2.84693-(-1.07661)));
            yy = -12.52 + (((tickAnim - 7) / 8) * (-12.38438-(-12.52)));
            zz = -0.30598 + (((tickAnim - 7) / 8) * (0.64684-(-0.30598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.22177 + (((tickAnim - 0) / 4) * (-15.53533-(2.22177)));
            yy = -19.88953 + (((tickAnim - 0) / 4) * (-19.28834-(-19.88953)));
            zz = -3.81745 + (((tickAnim - 0) / 4) * (9.74876-(-3.81745)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -15.53533 + (((tickAnim - 4) / 1) * (-21.93289-(-15.53533)));
            yy = -19.28834 + (((tickAnim - 4) / 1) * (-17.66837-(-19.28834)));
            zz = 9.74876 + (((tickAnim - 4) / 1) * (14.47156-(9.74876)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -21.93289 + (((tickAnim - 5) / 2) * (-20.22003-(-21.93289)));
            yy = -17.66837 + (((tickAnim - 5) / 2) * (-17.3252-(-17.66837)));
            zz = 14.47156 + (((tickAnim - 5) / 2) * (13.14518-(14.47156)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -20.22003 + (((tickAnim - 7) / 8) * (2.22177-(-20.22003)));
            yy = -17.3252 + (((tickAnim - 7) / 8) * (-19.88953-(-17.3252)));
            zz = 13.14518 + (((tickAnim - 7) / 8) * (-3.81745-(13.14518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.54586 + (((tickAnim - 0) / 4) * (-1.94816-(25.54586)));
            yy = -14.5477 + (((tickAnim - 0) / 4) * (-14.66831-(-14.5477)));
            zz = -13.6227 + (((tickAnim - 0) / 4) * (12.20791-(-13.6227)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -1.94816 + (((tickAnim - 4) / 1) * (-23.59841-(-1.94816)));
            yy = -14.66831 + (((tickAnim - 4) / 1) * (-10.35468-(-14.66831)));
            zz = 12.20791 + (((tickAnim - 4) / 1) * (32.19275-(12.20791)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -23.59841 + (((tickAnim - 5) / 2) * (-29.0144-(-23.59841)));
            yy = -10.35468 + (((tickAnim - 5) / 2) * (-7.32569-(-10.35468)));
            zz = 32.19275 + (((tickAnim - 5) / 2) * (36.93789-(32.19275)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -29.0144 + (((tickAnim - 7) / 4) * (-4.65022-(-29.0144)));
            yy = -7.32569 + (((tickAnim - 7) / 4) * (-10.57722-(-7.32569)));
            zz = 36.93789 + (((tickAnim - 7) / 4) * (14.32354-(36.93789)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -4.65022 + (((tickAnim - 11) / 2) * (12.13556-(-4.65022)));
            yy = -10.57722 + (((tickAnim - 11) / 2) * (-12.94956-(-10.57722)));
            zz = 14.32354 + (((tickAnim - 11) / 2) * (-1.20804-(14.32354)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.13556 + (((tickAnim - 13) / 2) * (25.54586-(12.13556)));
            yy = -12.94956 + (((tickAnim - 13) / 2) * (-14.5477-(-12.94956)));
            zz = -1.20804 + (((tickAnim - 13) / 2) * (-13.6227-(-1.20804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalkingEramo(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraWalkingAmphibianBase entity = (EntityPrehistoricFloraWalkingAmphibianBase) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.4 + (((tickAnim - 0) / 3) * (-0.75-(-2.4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-1.93-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.75 + (((tickAnim - 3) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -1.93 + (((tickAnim - 3) / 4) * (-0.16667-(-1.93)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 7) / 4) * (1.87-(-0.16667)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 11) / 4) * (-2.5-(-0.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 1.87 + (((tickAnim - 11) / 4) * (2.5-(1.87)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -2.5 + (((tickAnim - 15) / 4) * (-4.15-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 15) / 4) * (1.87-(2.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -4.15 + (((tickAnim - 19) / 4) * (-5-(-4.15)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 1.87 + (((tickAnim - 19) / 4) * (-0.16667-(1.87)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -5 + (((tickAnim - 23) / 4) * (-4.15-(-5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 23) / 4) * (-1.93-(-0.16667)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -4.15 + (((tickAnim - 27) / 3) * (-2.4-(-4.15)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = -1.93 + (((tickAnim - 27) / 3) * (-2.5-(-1.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.19 + (((tickAnim - 0) / 1) * (0-(0.19)));
            yy = -0.93 + (((tickAnim - 0) / 1) * (-1-(-0.93)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (-0.67-(0)));
            yy = -1 + (((tickAnim - 1) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.67 + (((tickAnim - 4) / 4) * (-1-(-0.67)));
            yy = -0.73 + (((tickAnim - 4) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1 + (((tickAnim - 8) / 4) * (-0.73-(-1)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.73 + (((tickAnim - 12) / 4) * (0-(-0.73)));
            yy = 0.67 + (((tickAnim - 12) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0.73-(0)));
            yy = 1 + (((tickAnim - 16) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.73 + (((tickAnim - 20) / 3) * (1-(0.73)));
            yy = 0.67 + (((tickAnim - 20) / 3) * (0-(0.67)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 23) / 4) * (0.77-(1)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0.77 + (((tickAnim - 27) / 3) * (0.19-(0.77)));
            yy = -0.73 + (((tickAnim - 27) / 3) * (-0.93-(-0.73)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.41 + (((tickAnim - 0) / 2) * (-2.8-(-2.41)));
            yy = -0.86 + (((tickAnim - 0) / 2) * (-1-(-0.86)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -2.8 + (((tickAnim - 2) / 4) * (-3.47-(-2.8)));
            yy = -1 + (((tickAnim - 2) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -3.47 + (((tickAnim - 6) / 3) * (-3.8-(-3.47)));
            yy = -0.73 + (((tickAnim - 6) / 3) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.8 + (((tickAnim - 9) / 4) * (-3.53-(-3.8)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3.53 + (((tickAnim - 13) / 4) * (-2.8-(-3.53)));
            yy = 0.67 + (((tickAnim - 13) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -2.8 + (((tickAnim - 17) / 4) * (-2.07-(-2.8)));
            yy = 1 + (((tickAnim - 17) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -2.07 + (((tickAnim - 21) / 3) * (-1.8-(-2.07)));
            yy = 0.67 + (((tickAnim - 21) / 3) * (0-(0.67)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.8 + (((tickAnim - 24) / 4) * (-2.03-(-1.8)));
            yy = 0 + (((tickAnim - 24) / 4) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.03 + (((tickAnim - 28) / 2) * (-2.41-(-2.03)));
            yy = -0.73 + (((tickAnim - 28) / 2) * (-0.86-(-0.73)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.62 + (((tickAnim - 0) / 3) * (-3.1-(-2.62)));
            yy = -0.83 + (((tickAnim - 0) / 3) * (-1-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.1 + (((tickAnim - 3) / 3) * (-3.77-(-3.1)));
            yy = -1 + (((tickAnim - 3) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -3.77 + (((tickAnim - 6) / 3) * (-4.1-(-3.77)));
            yy = -0.73 + (((tickAnim - 6) / 3) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -4.1 + (((tickAnim - 9) / 4) * (-3.83-(-4.1)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3.83 + (((tickAnim - 13) / 4) * (-3.1-(-3.83)));
            yy = 0.67 + (((tickAnim - 13) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -3.1 + (((tickAnim - 17) / 4) * (-2.37-(-3.1)));
            yy = 1 + (((tickAnim - 17) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -2.37 + (((tickAnim - 21) / 3) * (-2.1-(-2.37)));
            yy = 0.67 + (((tickAnim - 21) / 3) * (0-(0.67)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -2.1 + (((tickAnim - 24) / 4) * (-2.33-(-2.1)));
            yy = 0 + (((tickAnim - 24) / 4) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.33 + (((tickAnim - 28) / 2) * (-2.62-(-2.33)));
            yy = -0.73 + (((tickAnim - 28) / 2) * (-0.83-(-0.73)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.67 + (((tickAnim - 0) / 3) * (2-(2.67)));
            yy = -0.76 + (((tickAnim - 0) / 3) * (-1-(-0.76)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 3) / 4) * (1.33-(2)));
            yy = -1 + (((tickAnim - 3) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 1.33 + (((tickAnim - 7) / 4) * (1-(1.33)));
            yy = -0.73 + (((tickAnim - 7) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 11) / 3) * (1.27-(1)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1.27 + (((tickAnim - 14) / 4) * (2-(1.27)));
            yy = 0.67 + (((tickAnim - 14) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2 + (((tickAnim - 18) / 4) * (2.73-(2)));
            yy = 1 + (((tickAnim - 18) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.73 + (((tickAnim - 22) / 4) * (3-(2.73)));
            yy = 0.67 + (((tickAnim - 22) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 3 + (((tickAnim - 26) / 3) * (2.77-(3)));
            yy = 0 + (((tickAnim - 26) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.77 + (((tickAnim - 29) / 1) * (2.67-(2.77)));
            yy = -0.73 + (((tickAnim - 29) / 1) * (-0.76-(-0.73)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5.6 + (((tickAnim - 0) / 1) * (5.57-(5.6)));
            yy = -0.63 + (((tickAnim - 0) / 1) * (-0.73-(-0.63)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 5.57 + (((tickAnim - 1) / 3) * (4.8-(5.57)));
            yy = -0.73 + (((tickAnim - 1) / 3) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.8 + (((tickAnim - 4) / 4) * (4.13-(4.8)));
            yy = -1 + (((tickAnim - 4) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.13 + (((tickAnim - 8) / 4) * (3.8-(4.13)));
            yy = -0.73 + (((tickAnim - 8) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.8 + (((tickAnim - 12) / 3) * (4.07-(3.8)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.07 + (((tickAnim - 15) / 4) * (4.8-(4.07)));
            yy = 0.67 + (((tickAnim - 15) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 4.8 + (((tickAnim - 19) / 4) * (5.53-(4.8)));
            yy = 1 + (((tickAnim - 19) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 5.53 + (((tickAnim - 23) / 4) * (5.8-(5.53)));
            yy = 0.67 + (((tickAnim - 23) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5.8 + (((tickAnim - 27) / 3) * (5.6-(5.8)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.63-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40.37 + (((tickAnim - 0) / 2) * (40.27-(40.37)));
            yy = -0.42 + (((tickAnim - 0) / 2) * (-0.73-(-0.42)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 40.27 + (((tickAnim - 2) / 4) * (39.5-(40.27)));
            yy = -0.73 + (((tickAnim - 2) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 39.5 + (((tickAnim - 6) / 2) * (38.83-(39.5)));
            yy = -1 + (((tickAnim - 6) / 2) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 38.83 + (((tickAnim - 8) / 5) * (38.5-(38.83)));
            yy = -0.73 + (((tickAnim - 8) / 5) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 13) / 3) * (38.77-(38.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 38.77 + (((tickAnim - 16) / 4) * (39.5-(38.77)));
            yy = 0.67 + (((tickAnim - 16) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 39.5 + (((tickAnim - 20) / 4) * (40.23-(39.5)));
            yy = 1 + (((tickAnim - 20) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 40.23 + (((tickAnim - 24) / 4) * (40.5-(40.23)));
            yy = 0.67 + (((tickAnim - 24) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 40.5 + (((tickAnim - 28) / 2) * (40.37-(40.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.42-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 90.03 + (((tickAnim - 0) / 3) * (89.87-(90.03)));
            yy = -0.21 + (((tickAnim - 0) / 3) * (-0.73-(-0.21)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 89.87 + (((tickAnim - 3) / 4) * (89.1-(89.87)));
            yy = -0.73 + (((tickAnim - 3) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 89.1 + (((tickAnim - 7) / 2) * (88.43-(89.1)));
            yy = -1 + (((tickAnim - 7) / 2) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 88.43 + (((tickAnim - 9) / 4) * (88.1-(88.43)));
            yy = -0.73 + (((tickAnim - 9) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 88.1 + (((tickAnim - 13) / 4) * (88.37-(88.1)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 88.37 + (((tickAnim - 17) / 4) * (89.1-(88.37)));
            yy = 0.67 + (((tickAnim - 17) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 89.1 + (((tickAnim - 21) / 4) * (89.83-(89.1)));
            yy = 1 + (((tickAnim - 21) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 89.83 + (((tickAnim - 25) / 3) * (90.1-(89.83)));
            yy = 0.67 + (((tickAnim - 25) / 3) * (0-(0.67)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 90.1 + (((tickAnim - 28) / 2) * (90.03-(90.1)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.21-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 86.8 + (((tickAnim - 0) / 3) * (86.57-(86.8)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 86.57 + (((tickAnim - 3) / 5) * (85.8-(86.57)));
            yy = -0.73 + (((tickAnim - 3) / 5) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 85.8 + (((tickAnim - 8) / 3) * (85.13-(85.8)));
            yy = -1 + (((tickAnim - 8) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 85.13 + (((tickAnim - 11) / 3) * (84.8-(85.13)));
            yy = -0.73 + (((tickAnim - 11) / 3) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 84.8 + (((tickAnim - 14) / 4) * (85.07-(84.8)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 85.07 + (((tickAnim - 18) / 4) * (85.8-(85.07)));
            yy = 0.67 + (((tickAnim - 18) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 85.8 + (((tickAnim - 22) / 4) * (86.53-(85.8)));
            yy = 1 + (((tickAnim - 22) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 86.53 + (((tickAnim - 26) / 3) * (86.8-(86.53)));
            yy = 0.67 + (((tickAnim - 26) / 3) * (0-(0.67)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 86.8 + (((tickAnim - 29) / 1) * (86.8-(86.8)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9.57852 + (((tickAnim - 0) / 8) * (7.8565-(9.57852)));
            yy = -7.2747 + (((tickAnim - 0) / 8) * (-15.64508-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 0) / 8) * (9.32922-(20.85613)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.8565 + (((tickAnim - 8) / 7) * (9.57852-(7.8565)));
            yy = -15.64508 + (((tickAnim - 8) / 7) * (-7.2747-(-15.64508)));
            zz = 9.32922 + (((tickAnim - 8) / 7) * (20.85613-(9.32922)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 9.57852 + (((tickAnim - 15) / 8) * (8.08431-(9.57852)));
            yy = -7.2747 + (((tickAnim - 15) / 8) * (-5.74118-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 15) / 8) * (10.73259-(20.85613)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8.08431 + (((tickAnim - 23) / 7) * (9.57852-(8.08431)));
            yy = -5.74118 + (((tickAnim - 23) / 7) * (-7.2747-(-5.74118)));
            zz = 10.73259 + (((tickAnim - 23) / 7) * (20.85613-(10.73259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -32.5 + (((tickAnim - 0) / 8) * (-25-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -25 + (((tickAnim - 8) / 7) * (-22.5-(-25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -22.5 + (((tickAnim - 15) / 8) * (-25-(-22.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -25 + (((tickAnim - 23) / 7) * (-32.5-(-25)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 8) * (-20-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 7) * (-27.5-(-20)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -27.5 + (((tickAnim - 15) / 8) * (-20-(-27.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 23) / 7) * (-22.5-(-20)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(20), clawR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.08431 + (((tickAnim - 0) / 8) * (9.57852-(8.08431)));
            yy = 5.74118 + (((tickAnim - 0) / 8) * (7.2747-(5.74118)));
            zz = -10.73259 + (((tickAnim - 0) / 8) * (-20.85613-(-10.73259)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 9.57852 + (((tickAnim - 8) / 7) * (7.8565-(9.57852)));
            yy = 7.2747 + (((tickAnim - 8) / 7) * (15.64508-(7.2747)));
            zz = -20.85613 + (((tickAnim - 8) / 7) * (-9.32922-(-20.85613)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 7.8565 + (((tickAnim - 15) / 8) * (9.57852-(7.8565)));
            yy = 15.64508 + (((tickAnim - 15) / 8) * (7.2747-(15.64508)));
            zz = -9.32922 + (((tickAnim - 15) / 8) * (-20.85613-(-9.32922)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 9.57852 + (((tickAnim - 23) / 7) * (8.08431-(9.57852)));
            yy = 7.2747 + (((tickAnim - 23) / 7) * (5.74118-(7.2747)));
            zz = -20.85613 + (((tickAnim - 23) / 7) * (-10.73259-(-20.85613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 8) * (32.5-(25)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 32.5 + (((tickAnim - 8) / 7) * (25-(32.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 25 + (((tickAnim - 15) / 8) * (22.5-(25)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 22.5 + (((tickAnim - 23) / 7) * (25-(22.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 8) * (22.5-(20)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 22.5 + (((tickAnim - 8) / 7) * (20-(22.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 8) * (27.5-(20)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 27.5 + (((tickAnim - 23) / 7) * (20-(27.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(-20), clawL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.67 + (((tickAnim - 0) / 2) * (-0.44065-(-2.67)));
            yy = -19.34 + (((tickAnim - 0) / 2) * (-9.99039-(-19.34)));
            zz = 1.28 + (((tickAnim - 0) / 2) * (0.03849-(1.28)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.44065 + (((tickAnim - 2) / 4) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 2) / 4) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 2) / 4) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -10.40439 + (((tickAnim - 6) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 6) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 6) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -11.57885 + (((tickAnim - 9) / 8) * (-0.44065-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 9) / 8) * (-9.99039-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 9) / 8) * (0.03849-(6.26781)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -0.44065 + (((tickAnim - 17) / 4) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 17) / 4) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 17) / 4) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -10.40439 + (((tickAnim - 21) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 21) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 21) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -11.57885 + (((tickAnim - 24) / 6) * (-2.67-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 24) / 6) * (-19.34-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 24) / 6) * (1.28-(6.26781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.34 + (((tickAnim - 0) / 2) * (2.31028-(1.34)));
            yy = -22.37 + (((tickAnim - 0) / 2) * (-32.11205-(-22.37)));
            zz = 8.93 + (((tickAnim - 0) / 2) * (1.41008-(8.93)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 2.31028 + (((tickAnim - 2) / 7) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 2) / 7) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 2) / 7) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 9) / 4) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 9) / 4) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.60716 + (((tickAnim - 13) / 4) * (2.31028-(0.60716)));
            yy = -15.05933 + (((tickAnim - 13) / 4) * (-32.11205-(-15.05933)));
            zz = 14.577 + (((tickAnim - 13) / 4) * (1.41008-(14.577)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 2.31028 + (((tickAnim - 17) / 7) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 17) / 7) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 17) / 7) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 24) / 4) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 24) / 4) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.60716 + (((tickAnim - 28) / 2) * (1.34-(0.60716)));
            yy = -15.05933 + (((tickAnim - 28) / 2) * (-22.37-(-15.05933)));
            zz = 14.577 + (((tickAnim - 28) / 2) * (8.93-(14.577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.42 + (((tickAnim - 0) / 2) * (5.67-(1.42)));
            yy = -2.25 + (((tickAnim - 0) / 2) * (-8.99-(-2.25)));
            zz = 2 + (((tickAnim - 0) / 2) * (7.98-(2)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 5.67 + (((tickAnim - 2) / 1) * (11.33038-(5.67)));
            yy = -8.99 + (((tickAnim - 2) / 1) * (-17.97524-(-8.99)));
            zz = 7.98 + (((tickAnim - 2) / 1) * (15.96276-(7.98)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 11.33038 + (((tickAnim - 3) / 4) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 3) / 4) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 3) / 4) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -22 + (((tickAnim - 7) / 4) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 7) / 4) * (0-(0.00001)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 11) / 3) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.00003-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.00001 + (((tickAnim - 14) / 4) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 14) / 4) * (-17.97524-(0)));
            zz = 0.00003 + (((tickAnim - 14) / 4) * (15.96276-(0.00003)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 11.33038 + (((tickAnim - 18) / 4) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 18) / 4) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 18) / 4) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 22) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 22) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 24) / 5) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 24) / 5) * (0.00003-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -0.00001 + (((tickAnim - 29) / 1) * (1.42-(-0.00001)));
            yy = 0 + (((tickAnim - 29) / 1) * (-2.25-(0)));
            zz = 0.00003 + (((tickAnim - 29) / 1) * (2-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.22707 + (((tickAnim - 0) / 1) * (1.08-(1.22707)));
            yy = -9.96928 + (((tickAnim - 0) / 1) * (-8.39-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 0) / 1) * (0.83-(0.94378)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 1.08 + (((tickAnim - 1) / 3) * (0.65-(1.08)));
            yy = -8.39 + (((tickAnim - 1) / 3) * (0.35-(-8.39)));
            zz = 0.83 + (((tickAnim - 1) / 3) * (0.5-(0.83)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.65 + (((tickAnim - 4) / 4) * (0-(0.65)));
            yy = 0.35 + (((tickAnim - 4) / 4) * (19-(0.35)));
            zz = 0.5 + (((tickAnim - 4) / 4) * (-0.00001-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 8) / 3) * (0.3851-(19)));
            zz = -0.00001 + (((tickAnim - 8) / 3) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 17.66376 + (((tickAnim - 11) / 2) * (8.27-(17.66376)));
            yy = 0.3851 + (((tickAnim - 11) / 2) * (-6.82-(0.3851)));
            zz = 21.80407 + (((tickAnim - 11) / 2) * (9.88-(21.80407)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.27 + (((tickAnim - 13) / 2) * (1.22707-(8.27)));
            yy = -6.82 + (((tickAnim - 13) / 2) * (-9.96928-(-6.82)));
            zz = 9.88 + (((tickAnim - 13) / 2) * (0.94378-(9.88)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 1.22707 + (((tickAnim - 15) / 2) * (0.98-(1.22707)));
            yy = -9.96928 + (((tickAnim - 15) / 2) * (-7.98-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 15) / 2) * (0.76-(0.94378)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.98 + (((tickAnim - 17) / 2) * (0.41-(0.98)));
            yy = -7.98 + (((tickAnim - 17) / 2) * (1.51-(-7.98)));
            zz = 0.76 + (((tickAnim - 17) / 2) * (0.32-(0.76)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.41 + (((tickAnim - 19) / 3) * (0-(0.41)));
            yy = 1.51 + (((tickAnim - 19) / 3) * (19-(1.51)));
            zz = 0.32 + (((tickAnim - 19) / 3) * (-0.00001-(0.32)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 22) / 2) * (8.3851-(19)));
            zz = -0.00001 + (((tickAnim - 22) / 2) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 17.66376 + (((tickAnim - 24) / 3) * (15.32-(17.66376)));
            yy = 8.3851 + (((tickAnim - 24) / 3) * (-2.67-(8.3851)));
            zz = 21.80407 + (((tickAnim - 24) / 3) * (18.82-(21.80407)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 15.32 + (((tickAnim - 27) / 1) * (8.27-(15.32)));
            yy = -2.67 + (((tickAnim - 27) / 1) * (-7.82-(-2.67)));
            zz = 18.82 + (((tickAnim - 27) / 1) * (9.88-(18.82)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 8.27 + (((tickAnim - 28) / 2) * (1.22707-(8.27)));
            yy = -7.82 + (((tickAnim - 28) / 2) * (-9.96928-(-7.82)));
            zz = 9.88 + (((tickAnim - 28) / 2) * (0.94378-(9.88)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11.08 + (((tickAnim - 0) / 2) * (-11.57885-(-11.08)));
            yy = 51.4 + (((tickAnim - 0) / 2) * (56.7385-(51.4)));
            zz = -14.51 + (((tickAnim - 0) / 2) * (-6.26781-(-14.51)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -11.57885 + (((tickAnim - 2) / 7) * (-0.44065-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 2) / 7) * (9.99039-(56.7385)));
            zz = -6.26781 + (((tickAnim - 2) / 7) * (-0.03849-(-6.26781)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.44065 + (((tickAnim - 9) / 4) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 9) / 4) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 9) / 4) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -10.40439 + (((tickAnim - 13) / 4) * (-11.57885-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 13) / 4) * (56.7385-(44.27313)));
            zz = -25.50718 + (((tickAnim - 13) / 4) * (-6.26781-(-25.50718)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -11.57885 + (((tickAnim - 17) / 6) * (-2.67-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 17) / 6) * (19.34-(56.7385)));
            zz = -6.26781 + (((tickAnim - 17) / 6) * (-1.28-(-6.26781)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -2.67 + (((tickAnim - 23) / 1) * (-0.44065-(-2.67)));
            yy = 19.34 + (((tickAnim - 23) / 1) * (9.99039-(19.34)));
            zz = -1.28 + (((tickAnim - 23) / 1) * (-0.03849-(-1.28)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -0.44065 + (((tickAnim - 24) / 4) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 24) / 4) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 24) / 4) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -10.40439 + (((tickAnim - 28) / 2) * (-11.08-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 28) / 2) * (51.4-(44.27313)));
            zz = -25.50718 + (((tickAnim - 28) / 2) * (-14.51-(-25.50718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.62 + (((tickAnim - 0) / 2) * (0-(0.62)));
            yy = 16.63 + (((tickAnim - 0) / 2) * (11-(16.63)));
            zz = -0.38 + (((tickAnim - 0) / 2) * (-0.00001-(-0.38)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 2) / 4) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 2) / 4) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.60716 + (((tickAnim - 6) / 3) * (2.31028-(0.60716)));
            yy = 15.05933 + (((tickAnim - 6) / 3) * (32.11205-(15.05933)));
            zz = -14.577 + (((tickAnim - 6) / 3) * (-1.41008-(-14.577)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 2.31028 + (((tickAnim - 9) / 8) * (0-(2.31028)));
            yy = 32.11205 + (((tickAnim - 9) / 8) * (11-(32.11205)));
            zz = -1.41008 + (((tickAnim - 9) / 8) * (-0.00001-(-1.41008)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 17) / 4) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 17) / 4) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.60716 + (((tickAnim - 21) / 2) * (1.34-(0.60716)));
            yy = 15.05933 + (((tickAnim - 21) / 2) * (22.37-(15.05933)));
            zz = -14.577 + (((tickAnim - 21) / 2) * (-8.93-(-14.577)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 1.34 + (((tickAnim - 23) / 1) * (2.31028-(1.34)));
            yy = 22.37 + (((tickAnim - 23) / 1) * (32.11205-(22.37)));
            zz = -8.93 + (((tickAnim - 23) / 1) * (-1.41008-(-8.93)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 2.31028 + (((tickAnim - 24) / 6) * (0.62-(2.31028)));
            yy = 32.11205 + (((tickAnim - 24) / 6) * (16.63-(32.11205)));
            zz = -1.41008 + (((tickAnim - 24) / 6) * (-0.38-(-1.41008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 21.25 + (((tickAnim - 0) / 3) * (16.73-(21.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 3) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -0.00001 + (((tickAnim - 7) / 4) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 7) / 4) * (17.97524-(0)));
            zz = -0.00003 + (((tickAnim - 7) / 4) * (-15.96276-(-0.00003)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.33038 + (((tickAnim - 11) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 11) / 3) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 11) / 3) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 22 + (((tickAnim - 14) / 3) * (16.73-(22)));
            zz = -0.00001 + (((tickAnim - 14) / 3) * (0-(-0.00001)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 17) / 5) * (0-(16.73)));
            zz = 0 + (((tickAnim - 17) / 5) * (-0.00003-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -0.00001 + (((tickAnim - 22) / 1) * (1.42-(-0.00001)));
            yy = 0 + (((tickAnim - 22) / 1) * (2.25-(0)));
            zz = -0.00003 + (((tickAnim - 22) / 1) * (-2-(-0.00003)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 1.42 + (((tickAnim - 23) / 1) * (5.67-(1.42)));
            yy = 2.25 + (((tickAnim - 23) / 1) * (8.99-(2.25)));
            zz = -2 + (((tickAnim - 23) / 1) * (-7.98-(-2)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 5.67 + (((tickAnim - 24) / 2) * (11.33038-(5.67)));
            yy = 8.99 + (((tickAnim - 24) / 2) * (17.97524-(8.99)));
            zz = -7.98 + (((tickAnim - 24) / 2) * (-15.96276-(-7.98)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 11.33038 + (((tickAnim - 26) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 26) / 3) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 26) / 3) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 22 + (((tickAnim - 29) / 1) * (21.25-(22)));
            zz = -0.00001 + (((tickAnim - 29) / 1) * (0-(-0.00001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 0) / 3) * (-0.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 0) / 3) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.66376 + (((tickAnim - 3) / 3) * (8.27-(17.66376)));
            yy = -0.3851 + (((tickAnim - 3) / 3) * (6.82-(-0.3851)));
            zz = -21.80407 + (((tickAnim - 3) / 3) * (-9.88-(-21.80407)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.27 + (((tickAnim - 6) / 2) * (1.22707-(8.27)));
            yy = 6.82 + (((tickAnim - 6) / 2) * (9.96928-(6.82)));
            zz = -9.88 + (((tickAnim - 6) / 2) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.22707 + (((tickAnim - 8) / 1) * (0.98-(1.22707)));
            yy = 9.96928 + (((tickAnim - 8) / 1) * (7.98-(9.96928)));
            zz = -0.94378 + (((tickAnim - 8) / 1) * (-0.76-(-0.94378)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.98 + (((tickAnim - 9) / 3) * (0.41-(0.98)));
            yy = 7.98 + (((tickAnim - 9) / 3) * (-1.51-(7.98)));
            zz = -0.76 + (((tickAnim - 9) / 3) * (-0.32-(-0.76)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.41 + (((tickAnim - 12) / 2) * (0-(0.41)));
            yy = -1.51 + (((tickAnim - 12) / 2) * (-19-(-1.51)));
            zz = -0.32 + (((tickAnim - 12) / 2) * (0.00001-(-0.32)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 14) / 3) * (-8.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 14) / 3) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 17.66376 + (((tickAnim - 17) / 2) * (15.32-(17.66376)));
            yy = -8.3851 + (((tickAnim - 17) / 2) * (2.67-(-8.3851)));
            zz = -21.80407 + (((tickAnim - 17) / 2) * (-18.82-(-21.80407)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 15.32 + (((tickAnim - 19) / 2) * (8.27-(15.32)));
            yy = 2.67 + (((tickAnim - 19) / 2) * (7.82-(2.67)));
            zz = -18.82 + (((tickAnim - 19) / 2) * (-9.88-(-18.82)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.27 + (((tickAnim - 21) / 2) * (1.22707-(8.27)));
            yy = 7.82 + (((tickAnim - 21) / 2) * (9.96928-(7.82)));
            zz = -9.88 + (((tickAnim - 21) / 2) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 1.22707 + (((tickAnim - 23) / 0) * (1.08-(1.22707)));
            yy = 9.96928 + (((tickAnim - 23) / 0) * (8.39-(9.96928)));
            zz = -0.94378 + (((tickAnim - 23) / 0) * (-0.83-(-0.94378)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1.08 + (((tickAnim - 23) / 4) * (0.65-(1.08)));
            yy = 8.39 + (((tickAnim - 23) / 4) * (-0.35-(8.39)));
            zz = -0.83 + (((tickAnim - 23) / 4) * (-0.5-(-0.83)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0.65 + (((tickAnim - 27) / 3) * (0-(0.65)));
            yy = -0.35 + (((tickAnim - 27) / 3) * (-19-(-0.35)));
            zz = -0.5 + (((tickAnim - 27) / 3) * (0.00001-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalkingLandEramo(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEramoscorpius entity = (EntityPrehistoricFloraEramoscorpius) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 6) / 6) * (-0.0095-(5)));
            yy = 0 + (((tickAnim - 6) / 6) * (-0.21782-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (4.99527-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = -0.0095 + (((tickAnim - 12) / 9) * (4.97634-(-0.0095)));
            yy = -0.21782 + (((tickAnim - 12) / 9) * (0.43461-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 12) / 9) * (-2.47636-(4.99527)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 4.97634 + (((tickAnim - 21) / 9) * (-2.48569-(4.97634)));
            yy = 0.43461 + (((tickAnim - 21) / 9) * (0.43502-(0.43461)));
            zz = -2.47636 + (((tickAnim - 21) / 9) * (2.52379-(-2.47636)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -2.48569 + (((tickAnim - 30) / 7) * (1.12581-(-2.48569)));
            yy = 0.43502 + (((tickAnim - 30) / 7) * (0.53517-(0.43502)));
            zz = 2.52379 + (((tickAnim - 30) / 7) * (-2.47539-(2.52379)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 1.12581 + (((tickAnim - 37) / 6) * (0.01431-(1.12581)));
            yy = 0.53517 + (((tickAnim - 37) / 6) * (0.43502-(0.53517)));
            zz = -2.47539 + (((tickAnim - 37) / 6) * (2.52379-(-2.47539)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0.01431 + (((tickAnim - 43) / 8) * (-4.96437-(0.01431)));
            yy = 0.43502 + (((tickAnim - 43) / 8) * (0.543-(0.43502)));
            zz = 2.52379 + (((tickAnim - 43) / 8) * (5.02155-(2.52379)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -4.96437 + (((tickAnim - 51) / 9) * (0-(-4.96437)));
            yy = 0.543 + (((tickAnim - 51) / 9) * (0-(0.543)));
            zz = 5.02155 + (((tickAnim - 51) / 9) * (0-(5.02155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 21) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 27) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 39) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 45) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 51) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 51) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 51) / 3) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 57) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.67 + (((tickAnim - 0) / 1) * (-0.44065-(-2.67)));
            yy = -19.34 + (((tickAnim - 0) / 1) * (-9.99039-(-19.34)));
            zz = 1.28 + (((tickAnim - 0) / 1) * (0.03849-(1.28)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -0.44065 + (((tickAnim - 1) / 3) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 1) / 3) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 1) / 3) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -10.40439 + (((tickAnim - 4) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 4) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 4) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -11.57885 + (((tickAnim - 7) / 6) * (-0.44065-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 7) / 6) * (-9.99039-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 7) / 6) * (0.03849-(6.26781)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.44065 + (((tickAnim - 13) / 3) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 13) / 3) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 13) / 3) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.40439 + (((tickAnim - 16) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 16) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 16) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -11.57885 + (((tickAnim - 19) / 5) * (-2.67-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 19) / 5) * (-19.34-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 19) / 5) * (1.28-(6.26781)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -2.67 + (((tickAnim - 24) / 1) * (-0.44065-(-2.67)));
            yy = -19.34 + (((tickAnim - 24) / 1) * (-9.99039-(-19.34)));
            zz = 1.28 + (((tickAnim - 24) / 1) * (0.03849-(1.28)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -0.44065 + (((tickAnim - 25) / 3) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 25) / 3) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 25) / 3) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -10.40439 + (((tickAnim - 28) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 28) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 28) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = -11.57885 + (((tickAnim - 31) / 6) * (-0.44065-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 31) / 6) * (-9.99039-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 31) / 6) * (0.03849-(6.26781)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.44065 + (((tickAnim - 37) / 3) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 37) / 3) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 37) / 3) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -10.40439 + (((tickAnim - 40) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 40) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 40) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -11.57885 + (((tickAnim - 43) / 5) * (-2.67-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 43) / 5) * (-19.34-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 43) / 5) * (1.28-(6.26781)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = -2.67 + (((tickAnim - 48) / 1) * (-0.44065-(-2.67)));
            yy = -19.34 + (((tickAnim - 48) / 1) * (-9.99039-(-19.34)));
            zz = 1.28 + (((tickAnim - 48) / 1) * (0.03849-(1.28)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -0.44065 + (((tickAnim - 49) / 3) * (-10.40439-(-0.44065)));
            yy = -9.99039 + (((tickAnim - 49) / 3) * (-44.27313-(-9.99039)));
            zz = 0.03849 + (((tickAnim - 49) / 3) * (25.50718-(0.03849)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -10.40439 + (((tickAnim - 52) / 3) * (-11.57885-(-10.40439)));
            yy = -44.27313 + (((tickAnim - 52) / 3) * (-56.7385-(-44.27313)));
            zz = 25.50718 + (((tickAnim - 52) / 3) * (6.26781-(25.50718)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -11.57885 + (((tickAnim - 55) / 5) * (-2.67-(-11.57885)));
            yy = -56.7385 + (((tickAnim - 55) / 5) * (-19.34-(-56.7385)));
            zz = 6.26781 + (((tickAnim - 55) / 5) * (1.28-(6.26781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.34 + (((tickAnim - 0) / 2) * (2.31028-(1.34)));
            yy = -22.37 + (((tickAnim - 0) / 2) * (-32.11205-(-22.37)));
            zz = 8.93 + (((tickAnim - 0) / 2) * (1.41008-(8.93)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 2.31028 + (((tickAnim - 2) / 6) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 2) / 6) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 2) / 6) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 8) / 3) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 8) / 3) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.60716 + (((tickAnim - 11) / 3) * (2.31028-(0.60716)));
            yy = -15.05933 + (((tickAnim - 11) / 3) * (-32.11205-(-15.05933)));
            zz = 14.577 + (((tickAnim - 11) / 3) * (1.41008-(14.577)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2.31028 + (((tickAnim - 14) / 6) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 14) / 6) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 14) / 6) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 20) / 3) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 20) / 3) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.60716 + (((tickAnim - 23) / 1) * (1.34-(0.60716)));
            yy = -15.05933 + (((tickAnim - 23) / 1) * (-22.37-(-15.05933)));
            zz = 14.577 + (((tickAnim - 23) / 1) * (8.93-(14.577)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 1.34 + (((tickAnim - 24) / 2) * (2.31028-(1.34)));
            yy = -22.37 + (((tickAnim - 24) / 2) * (-32.11205-(-22.37)));
            zz = 8.93 + (((tickAnim - 24) / 2) * (1.41008-(8.93)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 2.31028 + (((tickAnim - 26) / 6) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 26) / 6) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 26) / 6) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 32) / 3) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 32) / 3) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.60716 + (((tickAnim - 35) / 3) * (2.31028-(0.60716)));
            yy = -15.05933 + (((tickAnim - 35) / 3) * (-32.11205-(-15.05933)));
            zz = 14.577 + (((tickAnim - 35) / 3) * (1.41008-(14.577)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 2.31028 + (((tickAnim - 38) / 6) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 38) / 6) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 38) / 6) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 44) / 3) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 44) / 3) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0.60716 + (((tickAnim - 47) / 1) * (1.34-(0.60716)));
            yy = -15.05933 + (((tickAnim - 47) / 1) * (-22.37-(-15.05933)));
            zz = 14.577 + (((tickAnim - 47) / 1) * (8.93-(14.577)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 1.34 + (((tickAnim - 48) / 2) * (2.31028-(1.34)));
            yy = -22.37 + (((tickAnim - 48) / 2) * (-32.11205-(-22.37)));
            zz = 8.93 + (((tickAnim - 48) / 2) * (1.41008-(8.93)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 2.31028 + (((tickAnim - 50) / 6) * (0-(2.31028)));
            yy = -32.11205 + (((tickAnim - 50) / 6) * (-11-(-32.11205)));
            zz = 1.41008 + (((tickAnim - 50) / 6) * (0.00001-(1.41008)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 56) / 3) * (0.60716-(0)));
            yy = -11 + (((tickAnim - 56) / 3) * (-15.05933-(-11)));
            zz = 0.00001 + (((tickAnim - 56) / 3) * (14.577-(0.00001)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 0.60716 + (((tickAnim - 59) / 1) * (1.34-(0.60716)));
            yy = -15.05933 + (((tickAnim - 59) / 1) * (-22.37-(-15.05933)));
            zz = 14.577 + (((tickAnim - 59) / 1) * (8.93-(14.577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.42 + (((tickAnim - 0) / 1) * (5.67-(1.42)));
            yy = -2.25 + (((tickAnim - 0) / 1) * (-8.99-(-2.25)));
            zz = 2 + (((tickAnim - 0) / 1) * (7.98-(2)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 5.67 + (((tickAnim - 1) / 2) * (11.33038-(5.67)));
            yy = -8.99 + (((tickAnim - 1) / 2) * (-17.97524-(-8.99)));
            zz = 7.98 + (((tickAnim - 1) / 2) * (15.96276-(7.98)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 11.33038 + (((tickAnim - 3) / 3) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 3) / 3) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 3) / 3) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 6) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 6) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 8) / 4) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.00003-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.00001 + (((tickAnim - 12) / 3) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 12) / 3) * (-17.97524-(0)));
            zz = 0.00003 + (((tickAnim - 12) / 3) * (15.96276-(0.00003)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.33038 + (((tickAnim - 15) / 3) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 15) / 3) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 15) / 3) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 18) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 18) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (1.42-(0)));
            yy = -16.73 + (((tickAnim - 20) / 4) * (-2.25-(-16.73)));
            zz = 0 + (((tickAnim - 20) / 4) * (2-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 1.42 + (((tickAnim - 24) / 1) * (5.67-(1.42)));
            yy = -2.25 + (((tickAnim - 24) / 1) * (-8.99-(-2.25)));
            zz = 2 + (((tickAnim - 24) / 1) * (7.98-(2)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 5.67 + (((tickAnim - 25) / 2) * (11.33038-(5.67)));
            yy = -8.99 + (((tickAnim - 25) / 2) * (-17.97524-(-8.99)));
            zz = 7.98 + (((tickAnim - 25) / 2) * (15.96276-(7.98)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 11.33038 + (((tickAnim - 27) / 3) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 27) / 3) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 27) / 3) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 30) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 30) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (-0.00001-(0)));
            yy = -16.73 + (((tickAnim - 32) / 4) * (0-(-16.73)));
            zz = 0 + (((tickAnim - 32) / 4) * (0.00003-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -0.00001 + (((tickAnim - 36) / 3) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 36) / 3) * (-17.97524-(0)));
            zz = 0.00003 + (((tickAnim - 36) / 3) * (15.96276-(0.00003)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 11.33038 + (((tickAnim - 39) / 3) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 39) / 3) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 39) / 3) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 42) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 42) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (1.42-(0)));
            yy = -16.73 + (((tickAnim - 44) / 4) * (-2.25-(-16.73)));
            zz = 0 + (((tickAnim - 44) / 4) * (2-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 1.42 + (((tickAnim - 48) / 1) * (5.67-(1.42)));
            yy = -2.25 + (((tickAnim - 48) / 1) * (-8.99-(-2.25)));
            zz = 2 + (((tickAnim - 48) / 1) * (7.98-(2)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 5.67 + (((tickAnim - 49) / 2) * (11.33038-(5.67)));
            yy = -8.99 + (((tickAnim - 49) / 2) * (-17.97524-(-8.99)));
            zz = 7.98 + (((tickAnim - 49) / 2) * (15.96276-(7.98)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 11.33038 + (((tickAnim - 51) / 3) * (0-(11.33038)));
            yy = -17.97524 + (((tickAnim - 51) / 3) * (-22-(-17.97524)));
            zz = 15.96276 + (((tickAnim - 51) / 3) * (0.00001-(15.96276)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            yy = -22 + (((tickAnim - 54) / 2) * (-16.73-(-22)));
            zz = 0.00001 + (((tickAnim - 54) / 2) * (0-(0.00001)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (1.42-(0)));
            yy = -16.73 + (((tickAnim - 56) / 4) * (-2.25-(-16.73)));
            zz = 0 + (((tickAnim - 56) / 4) * (2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.22707 + (((tickAnim - 0) / 1) * (1.08-(1.22707)));
            yy = -9.96928 + (((tickAnim - 0) / 1) * (-8.39-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 0) / 1) * (0.83-(0.94378)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 1.08 + (((tickAnim - 1) / 2) * (0.65-(1.08)));
            yy = -8.39 + (((tickAnim - 1) / 2) * (0.35-(-8.39)));
            zz = 0.83 + (((tickAnim - 1) / 2) * (0.5-(0.83)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.65 + (((tickAnim - 3) / 3) * (0-(0.65)));
            yy = 0.35 + (((tickAnim - 3) / 3) * (19-(0.35)));
            zz = 0.5 + (((tickAnim - 3) / 3) * (-0.00001-(0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 6) / 3) * (0.3851-(19)));
            zz = -0.00001 + (((tickAnim - 6) / 3) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 17.66376 + (((tickAnim - 9) / 2) * (8.27-(17.66376)));
            yy = 0.3851 + (((tickAnim - 9) / 2) * (-6.82-(0.3851)));
            zz = 21.80407 + (((tickAnim - 9) / 2) * (9.88-(21.80407)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 8.27 + (((tickAnim - 11) / 1) * (1.22707-(8.27)));
            yy = -6.82 + (((tickAnim - 11) / 1) * (-9.96928-(-6.82)));
            zz = 9.88 + (((tickAnim - 11) / 1) * (0.94378-(9.88)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 1.22707 + (((tickAnim - 12) / 1) * (0.98-(1.22707)));
            yy = -9.96928 + (((tickAnim - 12) / 1) * (-7.98-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 12) / 1) * (0.76-(0.94378)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.98 + (((tickAnim - 13) / 2) * (0.41-(0.98)));
            yy = -7.98 + (((tickAnim - 13) / 2) * (1.51-(-7.98)));
            zz = 0.76 + (((tickAnim - 13) / 2) * (0.32-(0.76)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.41 + (((tickAnim - 15) / 3) * (0-(0.41)));
            yy = 1.51 + (((tickAnim - 15) / 3) * (19-(1.51)));
            zz = 0.32 + (((tickAnim - 15) / 3) * (-0.00001-(0.32)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 18) / 2) * (8.3851-(19)));
            zz = -0.00001 + (((tickAnim - 18) / 2) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 17.66376 + (((tickAnim - 20) / 2) * (15.32-(17.66376)));
            yy = 8.3851 + (((tickAnim - 20) / 2) * (-2.67-(8.3851)));
            zz = 21.80407 + (((tickAnim - 20) / 2) * (18.82-(21.80407)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 15.32 + (((tickAnim - 22) / 1) * (49.67549-(15.32)));
            yy = -2.67 + (((tickAnim - 22) / 1) * (-24.47814-(-2.67)));
            zz = 18.82 + (((tickAnim - 22) / 1) * (6.22351-(18.82)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 49.67549 + (((tickAnim - 23) / 1) * (1.22707-(49.67549)));
            yy = -24.47814 + (((tickAnim - 23) / 1) * (-9.96928-(-24.47814)));
            zz = 6.22351 + (((tickAnim - 23) / 1) * (0.94378-(6.22351)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 1.22707 + (((tickAnim - 24) / 1) * (1.08-(1.22707)));
            yy = -9.96928 + (((tickAnim - 24) / 1) * (-8.39-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 24) / 1) * (0.83-(0.94378)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 1.08 + (((tickAnim - 25) / 2) * (0.65-(1.08)));
            yy = -8.39 + (((tickAnim - 25) / 2) * (0.35-(-8.39)));
            zz = 0.83 + (((tickAnim - 25) / 2) * (0.5-(0.83)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0.65 + (((tickAnim - 27) / 3) * (0-(0.65)));
            yy = 0.35 + (((tickAnim - 27) / 3) * (19-(0.35)));
            zz = 0.5 + (((tickAnim - 27) / 3) * (-0.00001-(0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 30) / 3) * (0.3851-(19)));
            zz = -0.00001 + (((tickAnim - 30) / 3) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 17.66376 + (((tickAnim - 33) / 2) * (8.27-(17.66376)));
            yy = 0.3851 + (((tickAnim - 33) / 2) * (-6.82-(0.3851)));
            zz = 21.80407 + (((tickAnim - 33) / 2) * (9.88-(21.80407)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 8.27 + (((tickAnim - 35) / 1) * (1.22707-(8.27)));
            yy = -6.82 + (((tickAnim - 35) / 1) * (-9.96928-(-6.82)));
            zz = 9.88 + (((tickAnim - 35) / 1) * (0.94378-(9.88)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 1.22707 + (((tickAnim - 36) / 1) * (0.98-(1.22707)));
            yy = -9.96928 + (((tickAnim - 36) / 1) * (-7.98-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 36) / 1) * (0.76-(0.94378)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0.98 + (((tickAnim - 37) / 2) * (0.41-(0.98)));
            yy = -7.98 + (((tickAnim - 37) / 2) * (1.51-(-7.98)));
            zz = 0.76 + (((tickAnim - 37) / 2) * (0.32-(0.76)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0.41 + (((tickAnim - 39) / 3) * (0-(0.41)));
            yy = 1.51 + (((tickAnim - 39) / 3) * (19-(1.51)));
            zz = 0.32 + (((tickAnim - 39) / 3) * (-0.00001-(0.32)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 42) / 2) * (8.3851-(19)));
            zz = -0.00001 + (((tickAnim - 42) / 2) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 17.66376 + (((tickAnim - 44) / 2) * (15.32-(17.66376)));
            yy = 8.3851 + (((tickAnim - 44) / 2) * (-2.67-(8.3851)));
            zz = 21.80407 + (((tickAnim - 44) / 2) * (18.82-(21.80407)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 15.32 + (((tickAnim - 46) / 1) * (49.67549-(15.32)));
            yy = -2.67 + (((tickAnim - 46) / 1) * (-24.47814-(-2.67)));
            zz = 18.82 + (((tickAnim - 46) / 1) * (6.22351-(18.82)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 49.67549 + (((tickAnim - 47) / 1) * (1.22707-(49.67549)));
            yy = -24.47814 + (((tickAnim - 47) / 1) * (-9.96928-(-24.47814)));
            zz = 6.22351 + (((tickAnim - 47) / 1) * (0.94378-(6.22351)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 1.22707 + (((tickAnim - 48) / 1) * (1.08-(1.22707)));
            yy = -9.96928 + (((tickAnim - 48) / 1) * (-8.39-(-9.96928)));
            zz = 0.94378 + (((tickAnim - 48) / 1) * (0.83-(0.94378)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 1.08 + (((tickAnim - 49) / 2) * (0.65-(1.08)));
            yy = -8.39 + (((tickAnim - 49) / 2) * (0.35-(-8.39)));
            zz = 0.83 + (((tickAnim - 49) / 2) * (0.5-(0.83)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 0.65 + (((tickAnim - 51) / 3) * (0-(0.65)));
            yy = 0.35 + (((tickAnim - 51) / 3) * (19-(0.35)));
            zz = 0.5 + (((tickAnim - 51) / 3) * (-0.00001-(0.5)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 54) / 3) * (17.66376-(0)));
            yy = 19 + (((tickAnim - 54) / 3) * (0.3851-(19)));
            zz = -0.00001 + (((tickAnim - 54) / 3) * (21.80407-(-0.00001)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 17.66376 + (((tickAnim - 57) / 2) * (8.27-(17.66376)));
            yy = 0.3851 + (((tickAnim - 57) / 2) * (-6.82-(0.3851)));
            zz = 21.80407 + (((tickAnim - 57) / 2) * (9.88-(21.80407)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 8.27 + (((tickAnim - 59) / 1) * (1.22707-(8.27)));
            yy = -6.82 + (((tickAnim - 59) / 1) * (-9.96928-(-6.82)));
            zz = 9.88 + (((tickAnim - 59) / 1) * (0.94378-(9.88)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.19 + (((tickAnim - 0) / 1) * (0-(0.19)));
            yy = -0.93 + (((tickAnim - 0) / 1) * (-1-(-0.93)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (-0.67-(0)));
            yy = -1 + (((tickAnim - 1) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.67 + (((tickAnim - 5) / 4) * (-1-(-0.67)));
            yy = -0.73 + (((tickAnim - 5) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -1 + (((tickAnim - 9) / 3) * (-0.73-(-1)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.73 + (((tickAnim - 12) / 4) * (-2.5-(-0.73)));
            yy = 0.67 + (((tickAnim - 12) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (-1.77-(-2.5)));
            yy = 1 + (((tickAnim - 16) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -1.77 + (((tickAnim - 20) / 4) * (1-(-1.77)));
            yy = 0.67 + (((tickAnim - 20) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 24) / 3) * (0.77-(1)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0.77 + (((tickAnim - 27) / 4) * (2.5-(0.77)));
            yy = -0.73 + (((tickAnim - 27) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 31) / 4) * (-0.67-(2.5)));
            yy = -1 + (((tickAnim - 31) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -0.67 + (((tickAnim - 35) / 4) * (-1-(-0.67)));
            yy = -0.73 + (((tickAnim - 35) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -1 + (((tickAnim - 39) / 3) * (-0.73-(-1)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.73 + (((tickAnim - 42) / 4) * (0-(-0.73)));
            yy = 0.67 + (((tickAnim - 42) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0.73-(0)));
            yy = 1 + (((tickAnim - 46) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0.73 + (((tickAnim - 50) / 4) * (1-(0.73)));
            yy = 0.67 + (((tickAnim - 50) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 1 + (((tickAnim - 54) / 3) * (0.77-(1)));
            yy = 0 + (((tickAnim - 54) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0.77 + (((tickAnim - 57) / 3) * (0.19-(0.77)));
            yy = -0.73 + (((tickAnim - 57) / 3) * (-0.93-(-0.73)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.41 + (((tickAnim - 0) / 2) * (-2.8-(-2.41)));
            yy = -0.86 + (((tickAnim - 0) / 2) * (-1-(-0.86)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -2.8 + (((tickAnim - 2) / 4) * (-3.47-(-2.8)));
            yy = -1 + (((tickAnim - 2) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -3.47 + (((tickAnim - 6) / 4) * (-3.8-(-3.47)));
            yy = -0.73 + (((tickAnim - 6) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.8 + (((tickAnim - 10) / 3) * (-3.53-(-3.8)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3.53 + (((tickAnim - 13) / 4) * (-2.8-(-3.53)));
            yy = 0.67 + (((tickAnim - 13) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -2.8 + (((tickAnim - 17) / 4) * (-7.07-(-2.8)));
            yy = 1 + (((tickAnim - 17) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -7.07 + (((tickAnim - 21) / 4) * (-6.8-(-7.07)));
            yy = 0.67 + (((tickAnim - 21) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -6.8 + (((tickAnim - 25) / 3) * (-2.03-(-6.8)));
            yy = 0 + (((tickAnim - 25) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.03 + (((tickAnim - 28) / 2) * (-2.41-(-2.03)));
            yy = -0.73 + (((tickAnim - 28) / 2) * (-0.86-(-0.73)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -2.41 + (((tickAnim - 30) / 2) * (-2.8-(-2.41)));
            yy = -0.86 + (((tickAnim - 30) / 2) * (-1-(-0.86)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -2.8 + (((tickAnim - 32) / 4) * (-3.47-(-2.8)));
            yy = -1 + (((tickAnim - 32) / 4) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -3.47 + (((tickAnim - 36) / 4) * (-3.8-(-3.47)));
            yy = -0.73 + (((tickAnim - 36) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.8 + (((tickAnim - 40) / 3) * (-3.53-(-3.8)));
            yy = 0 + (((tickAnim - 40) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -3.53 + (((tickAnim - 43) / 4) * (-2.8-(-3.53)));
            yy = 0.67 + (((tickAnim - 43) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -2.8 + (((tickAnim - 47) / 4) * (-2.07-(-2.8)));
            yy = 1 + (((tickAnim - 47) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -2.07 + (((tickAnim - 51) / 4) * (-1.8-(-2.07)));
            yy = 0.67 + (((tickAnim - 51) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -1.8 + (((tickAnim - 55) / 3) * (-2.03-(-1.8)));
            yy = 0 + (((tickAnim - 55) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -2.03 + (((tickAnim - 58) / 2) * (-2.41-(-2.03)));
            yy = -0.73 + (((tickAnim - 58) / 2) * (-0.86-(-0.73)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.62 + (((tickAnim - 0) / 3) * (-3.1-(-2.62)));
            yy = -0.83 + (((tickAnim - 0) / 3) * (-1-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.1 + (((tickAnim - 3) / 3) * (-6.27-(-3.1)));
            yy = -1 + (((tickAnim - 3) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -6.27 + (((tickAnim - 6) / 4) * (-4.1-(-6.27)));
            yy = -0.73 + (((tickAnim - 6) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.1 + (((tickAnim - 10) / 3) * (-1.33-(-4.1)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -1.33 + (((tickAnim - 13) / 4) * (-3.1-(-1.33)));
            yy = 0.67 + (((tickAnim - 13) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -3.1 + (((tickAnim - 17) / 4) * (-4.87-(-3.1)));
            yy = 1 + (((tickAnim - 17) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -4.87 + (((tickAnim - 21) / 4) * (-4.6-(-4.87)));
            yy = 0.67 + (((tickAnim - 21) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -4.6 + (((tickAnim - 25) / 3) * (-2.33-(-4.6)));
            yy = 0 + (((tickAnim - 25) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.33 + (((tickAnim - 28) / 2) * (-2.62-(-2.33)));
            yy = -0.73 + (((tickAnim - 28) / 2) * (-0.83-(-0.73)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2.62 + (((tickAnim - 30) / 3) * (-3.1-(-2.62)));
            yy = -0.83 + (((tickAnim - 30) / 3) * (-1-(-0.83)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -3.1 + (((tickAnim - 33) / 3) * (-3.77-(-3.1)));
            yy = -1 + (((tickAnim - 33) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -3.77 + (((tickAnim - 36) / 4) * (-4.1-(-3.77)));
            yy = -0.73 + (((tickAnim - 36) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -4.1 + (((tickAnim - 40) / 3) * (-3.83-(-4.1)));
            yy = 0 + (((tickAnim - 40) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -3.83 + (((tickAnim - 43) / 4) * (-0.6-(-3.83)));
            yy = 0.67 + (((tickAnim - 43) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -0.6 + (((tickAnim - 47) / 4) * (-2.37-(-0.6)));
            yy = 1 + (((tickAnim - 47) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -2.37 + (((tickAnim - 51) / 4) * (-2.1-(-2.37)));
            yy = 0.67 + (((tickAnim - 51) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -2.1 + (((tickAnim - 55) / 3) * (-2.33-(-2.1)));
            yy = 0 + (((tickAnim - 55) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -2.33 + (((tickAnim - 58) / 2) * (-2.62-(-2.33)));
            yy = -0.73 + (((tickAnim - 58) / 2) * (-0.83-(-0.73)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.67 + (((tickAnim - 0) / 4) * (2-(2.67)));
            yy = -0.76 + (((tickAnim - 0) / 4) * (-1-(-0.76)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 4) / 3) * (-1.17-(2)));
            yy = -1 + (((tickAnim - 4) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -1.17 + (((tickAnim - 7) / 4) * (1-(-1.17)));
            yy = -0.73 + (((tickAnim - 7) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 11) / 3) * (1.27-(1)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1.27 + (((tickAnim - 14) / 4) * (2-(1.27)));
            yy = 0.67 + (((tickAnim - 14) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2 + (((tickAnim - 18) / 4) * (0.23-(2)));
            yy = 1 + (((tickAnim - 18) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0.23 + (((tickAnim - 22) / 4) * (0.5-(0.23)));
            yy = 0.67 + (((tickAnim - 22) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 26) / 4) * (0.17-(0.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (-0.76-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0.17 + (((tickAnim - 30) / 4) * (2-(0.17)));
            yy = -0.76 + (((tickAnim - 30) / 4) * (-1-(-0.76)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 2 + (((tickAnim - 34) / 3) * (1.33-(2)));
            yy = -1 + (((tickAnim - 34) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 1.33 + (((tickAnim - 37) / 4) * (1-(1.33)));
            yy = -0.73 + (((tickAnim - 37) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 41) / 3) * (1.27-(1)));
            yy = 0 + (((tickAnim - 41) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 1.27 + (((tickAnim - 44) / 4) * (2-(1.27)));
            yy = 0.67 + (((tickAnim - 44) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 2 + (((tickAnim - 48) / 4) * (2.73-(2)));
            yy = 1 + (((tickAnim - 48) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 2.73 + (((tickAnim - 52) / 4) * (3-(2.73)));
            yy = 0.67 + (((tickAnim - 52) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 3 + (((tickAnim - 56) / 3) * (2.77-(3)));
            yy = 0 + (((tickAnim - 56) / 3) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 2.77 + (((tickAnim - 59) / 1) * (2.67-(2.77)));
            yy = -0.73 + (((tickAnim - 59) / 1) * (-0.76-(-0.73)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5.6 + (((tickAnim - 0) / 1) * (5.57-(5.6)));
            yy = -0.63 + (((tickAnim - 0) / 1) * (-0.73-(-0.63)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 5.57 + (((tickAnim - 1) / 4) * (4.8-(5.57)));
            yy = -0.73 + (((tickAnim - 1) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.8 + (((tickAnim - 5) / 3) * (4.13-(4.8)));
            yy = -1 + (((tickAnim - 5) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.13 + (((tickAnim - 8) / 4) * (3.8-(4.13)));
            yy = -0.73 + (((tickAnim - 8) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.8 + (((tickAnim - 12) / 3) * (4.07-(3.8)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.07 + (((tickAnim - 15) / 4) * (4.8-(4.07)));
            yy = 0.67 + (((tickAnim - 15) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 4.8 + (((tickAnim - 19) / 4) * (5.53-(4.8)));
            yy = 1 + (((tickAnim - 19) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 5.53 + (((tickAnim - 23) / 4) * (5.8-(5.53)));
            yy = 0.67 + (((tickAnim - 23) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5.8 + (((tickAnim - 27) / 3) * (5.6-(5.8)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.63-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 5.6 + (((tickAnim - 30) / 1) * (5.57-(5.6)));
            yy = -0.63 + (((tickAnim - 30) / 1) * (-0.73-(-0.63)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 5.57 + (((tickAnim - 31) / 4) * (4.8-(5.57)));
            yy = -0.73 + (((tickAnim - 31) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 4.8 + (((tickAnim - 35) / 3) * (4.13-(4.8)));
            yy = -1 + (((tickAnim - 35) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 4.13 + (((tickAnim - 38) / 4) * (3.8-(4.13)));
            yy = -0.73 + (((tickAnim - 38) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 3.8 + (((tickAnim - 42) / 3) * (4.07-(3.8)));
            yy = 0 + (((tickAnim - 42) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 4.07 + (((tickAnim - 45) / 4) * (4.8-(4.07)));
            yy = 0.67 + (((tickAnim - 45) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 4.8 + (((tickAnim - 49) / 4) * (5.53-(4.8)));
            yy = 1 + (((tickAnim - 49) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 5.53 + (((tickAnim - 53) / 4) * (5.8-(5.53)));
            yy = 0.67 + (((tickAnim - 53) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 5.8 + (((tickAnim - 57) / 3) * (5.6-(5.8)));
            yy = 0 + (((tickAnim - 57) / 3) * (-0.63-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40.37 + (((tickAnim - 0) / 2) * (40.27-(40.37)));
            yy = -0.42 + (((tickAnim - 0) / 2) * (-0.73-(-0.42)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 40.27 + (((tickAnim - 2) / 4) * (39.5-(40.27)));
            yy = -0.73 + (((tickAnim - 2) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 39.5 + (((tickAnim - 6) / 3) * (38.83-(39.5)));
            yy = -1 + (((tickAnim - 6) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 38.83 + (((tickAnim - 9) / 4) * (38.5-(38.83)));
            yy = -0.73 + (((tickAnim - 9) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 13) / 3) * (38.77-(38.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 38.77 + (((tickAnim - 16) / 4) * (39.5-(38.77)));
            yy = 0.67 + (((tickAnim - 16) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 39.5 + (((tickAnim - 20) / 4) * (40.23-(39.5)));
            yy = 1 + (((tickAnim - 20) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 40.23 + (((tickAnim - 24) / 4) * (40.5-(40.23)));
            yy = 0.67 + (((tickAnim - 24) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 40.5 + (((tickAnim - 28) / 2) * (40.37-(40.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.42-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 40.37 + (((tickAnim - 30) / 2) * (40.27-(40.37)));
            yy = -0.42 + (((tickAnim - 30) / 2) * (-0.73-(-0.42)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 40.27 + (((tickAnim - 32) / 4) * (39.5-(40.27)));
            yy = -0.73 + (((tickAnim - 32) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 39.5 + (((tickAnim - 36) / 3) * (38.83-(39.5)));
            yy = -1 + (((tickAnim - 36) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 38.83 + (((tickAnim - 39) / 4) * (38.5-(38.83)));
            yy = -0.73 + (((tickAnim - 39) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 38.5 + (((tickAnim - 43) / 3) * (38.77-(38.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 38.77 + (((tickAnim - 46) / 4) * (39.5-(38.77)));
            yy = 0.67 + (((tickAnim - 46) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 39.5 + (((tickAnim - 50) / 4) * (40.23-(39.5)));
            yy = 1 + (((tickAnim - 50) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 40.23 + (((tickAnim - 54) / 4) * (40.5-(40.23)));
            yy = 0.67 + (((tickAnim - 54) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 40.5 + (((tickAnim - 58) / 2) * (40.37-(40.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (-0.42-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 90.03 + (((tickAnim - 0) / 3) * (89.87-(90.03)));
            yy = -0.21 + (((tickAnim - 0) / 3) * (-0.73-(-0.21)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 89.87 + (((tickAnim - 3) / 4) * (89.1-(89.87)));
            yy = -0.73 + (((tickAnim - 3) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 89.1 + (((tickAnim - 7) / 3) * (88.43-(89.1)));
            yy = -1 + (((tickAnim - 7) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 88.43 + (((tickAnim - 10) / 4) * (88.1-(88.43)));
            yy = -0.73 + (((tickAnim - 10) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 88.1 + (((tickAnim - 14) / 3) * (88.37-(88.1)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 88.37 + (((tickAnim - 17) / 4) * (89.1-(88.37)));
            yy = 0.67 + (((tickAnim - 17) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 89.1 + (((tickAnim - 21) / 4) * (89.83-(89.1)));
            yy = 1 + (((tickAnim - 21) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 89.83 + (((tickAnim - 25) / 4) * (90.1-(89.83)));
            yy = 0.67 + (((tickAnim - 25) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 90.1 + (((tickAnim - 29) / 1) * (90.03-(90.1)));
            yy = 0 + (((tickAnim - 29) / 1) * (-0.21-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 90.03 + (((tickAnim - 30) / 3) * (89.87-(90.03)));
            yy = -0.21 + (((tickAnim - 30) / 3) * (-0.73-(-0.21)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 89.87 + (((tickAnim - 33) / 4) * (89.1-(89.87)));
            yy = -0.73 + (((tickAnim - 33) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 89.1 + (((tickAnim - 37) / 3) * (88.43-(89.1)));
            yy = -1 + (((tickAnim - 37) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 88.43 + (((tickAnim - 40) / 4) * (88.1-(88.43)));
            yy = -0.73 + (((tickAnim - 40) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 88.1 + (((tickAnim - 44) / 3) * (88.37-(88.1)));
            yy = 0 + (((tickAnim - 44) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 88.37 + (((tickAnim - 47) / 4) * (89.1-(88.37)));
            yy = 0.67 + (((tickAnim - 47) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 89.1 + (((tickAnim - 51) / 4) * (89.83-(89.1)));
            yy = 1 + (((tickAnim - 51) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 89.83 + (((tickAnim - 55) / 4) * (90.1-(89.83)));
            yy = 0.67 + (((tickAnim - 55) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 55) / 4) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 90.1 + (((tickAnim - 59) / 1) * (90.03-(90.1)));
            yy = 0 + (((tickAnim - 59) / 1) * (-0.21-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 86.8 + (((tickAnim - 0) / 4) * (86.57-(86.8)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 86.57 + (((tickAnim - 4) / 4) * (85.8-(86.57)));
            yy = -0.73 + (((tickAnim - 4) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 85.8 + (((tickAnim - 8) / 3) * (85.13-(85.8)));
            yy = -1 + (((tickAnim - 8) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 85.13 + (((tickAnim - 11) / 4) * (84.8-(85.13)));
            yy = -0.73 + (((tickAnim - 11) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 84.8 + (((tickAnim - 15) / 3) * (85.07-(84.8)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 85.07 + (((tickAnim - 18) / 4) * (85.8-(85.07)));
            yy = 0.67 + (((tickAnim - 18) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 85.8 + (((tickAnim - 22) / 4) * (86.53-(85.8)));
            yy = 1 + (((tickAnim - 22) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 86.53 + (((tickAnim - 26) / 4) * (86.8-(86.53)));
            yy = 0.67 + (((tickAnim - 26) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 86.8 + (((tickAnim - 30) / 4) * (86.57-(86.8)));
            yy = 0 + (((tickAnim - 30) / 4) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 86.57 + (((tickAnim - 34) / 4) * (85.8-(86.57)));
            yy = -0.73 + (((tickAnim - 34) / 4) * (-1-(-0.73)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 85.8 + (((tickAnim - 38) / 3) * (85.13-(85.8)));
            yy = -1 + (((tickAnim - 38) / 3) * (-0.73-(-1)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 85.13 + (((tickAnim - 41) / 4) * (84.8-(85.13)));
            yy = -0.73 + (((tickAnim - 41) / 4) * (0-(-0.73)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 84.8 + (((tickAnim - 45) / 3) * (85.07-(84.8)));
            yy = 0 + (((tickAnim - 45) / 3) * (0.67-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 85.07 + (((tickAnim - 48) / 4) * (85.8-(85.07)));
            yy = 0.67 + (((tickAnim - 48) / 4) * (1-(0.67)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 85.8 + (((tickAnim - 52) / 4) * (86.53-(85.8)));
            yy = 1 + (((tickAnim - 52) / 4) * (0.67-(1)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 86.53 + (((tickAnim - 56) / 4) * (86.8-(86.53)));
            yy = 0.67 + (((tickAnim - 56) / 4) * (0-(0.67)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 9.57852 + (((tickAnim - 0) / 15) * (7.8565-(9.57852)));
            yy = -7.2747 + (((tickAnim - 0) / 15) * (-15.64508-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 0) / 15) * (9.32922-(20.85613)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.8565 + (((tickAnim - 15) / 15) * (9.57852-(7.8565)));
            yy = -15.64508 + (((tickAnim - 15) / 15) * (-7.2747-(-15.64508)));
            zz = 9.32922 + (((tickAnim - 15) / 15) * (20.85613-(9.32922)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 9.57852 + (((tickAnim - 30) / 15) * (8.08431-(9.57852)));
            yy = -7.2747 + (((tickAnim - 30) / 15) * (-5.74118-(-7.2747)));
            zz = 20.85613 + (((tickAnim - 30) / 15) * (10.73259-(20.85613)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 8.08431 + (((tickAnim - 45) / 15) * (9.57852-(8.08431)));
            yy = -5.74118 + (((tickAnim - 45) / 15) * (-7.2747-(-5.74118)));
            zz = 10.73259 + (((tickAnim - 45) / 15) * (20.85613-(10.73259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -32.5 + (((tickAnim - 0) / 15) * (-25-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -25 + (((tickAnim - 15) / 15) * (-22.5-(-25)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -22.5 + (((tickAnim - 30) / 15) * (-25-(-22.5)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = -25 + (((tickAnim - 45) / 15) * (-32.5-(-25)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 15) * (-20-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 15) * (-27.5-(-20)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -27.5 + (((tickAnim - 30) / 15) * (-20-(-27.5)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = -20 + (((tickAnim - 45) / 15) * (-22.5-(-20)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(20), clawR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 8.08431 + (((tickAnim - 0) / 15) * (9.57852-(8.08431)));
            yy = 5.74118 + (((tickAnim - 0) / 15) * (7.2747-(5.74118)));
            zz = -10.73259 + (((tickAnim - 0) / 15) * (-20.85613-(-10.73259)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.57852 + (((tickAnim - 15) / 15) * (7.8565-(9.57852)));
            yy = 7.2747 + (((tickAnim - 15) / 15) * (15.64508-(7.2747)));
            zz = -20.85613 + (((tickAnim - 15) / 15) * (-9.32922-(-20.85613)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 7.8565 + (((tickAnim - 30) / 15) * (9.57852-(7.8565)));
            yy = 15.64508 + (((tickAnim - 30) / 15) * (7.2747-(15.64508)));
            zz = -9.32922 + (((tickAnim - 30) / 15) * (-20.85613-(-9.32922)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 9.57852 + (((tickAnim - 45) / 15) * (8.08431-(9.57852)));
            yy = 7.2747 + (((tickAnim - 45) / 15) * (5.74118-(7.2747)));
            zz = -20.85613 + (((tickAnim - 45) / 15) * (-10.73259-(-20.85613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 15) * (32.5-(25)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 32.5 + (((tickAnim - 15) / 15) * (25-(32.5)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 25 + (((tickAnim - 30) / 15) * (22.5-(25)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 22.5 + (((tickAnim - 45) / 15) * (25-(22.5)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 15) * (22.5-(20)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 22.5 + (((tickAnim - 15) / 15) * (20-(22.5)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 20 + (((tickAnim - 30) / 15) * (27.5-(20)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 27.5 + (((tickAnim - 45) / 15) * (20-(27.5)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(-20), clawL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -11.08 + (((tickAnim - 0) / 1) * (-11.57885-(-11.08)));
            yy = 51.4 + (((tickAnim - 0) / 1) * (56.7385-(51.4)));
            zz = -14.51 + (((tickAnim - 0) / 1) * (-6.26781-(-14.51)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = -11.57885 + (((tickAnim - 1) / 6) * (-0.44065-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 1) / 6) * (9.99039-(56.7385)));
            zz = -6.26781 + (((tickAnim - 1) / 6) * (-0.03849-(-6.26781)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.44065 + (((tickAnim - 7) / 3) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 7) / 3) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 7) / 3) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.40439 + (((tickAnim - 10) / 3) * (-11.57885-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 10) / 3) * (56.7385-(44.27313)));
            zz = -25.50718 + (((tickAnim - 10) / 3) * (-6.26781-(-25.50718)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11.57885 + (((tickAnim - 13) / 5) * (-2.67-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 13) / 5) * (19.34-(56.7385)));
            zz = -6.26781 + (((tickAnim - 13) / 5) * (-1.28-(-6.26781)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -2.67 + (((tickAnim - 18) / 1) * (-0.44065-(-2.67)));
            yy = 19.34 + (((tickAnim - 18) / 1) * (9.99039-(19.34)));
            zz = -1.28 + (((tickAnim - 18) / 1) * (-0.03849-(-1.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.44065 + (((tickAnim - 19) / 3) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 19) / 3) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 19) / 3) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -10.40439 + (((tickAnim - 22) / 2) * (-11.08-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 22) / 2) * (51.4-(44.27313)));
            zz = -25.50718 + (((tickAnim - 22) / 2) * (-14.51-(-25.50718)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -11.08 + (((tickAnim - 24) / 1) * (-11.57885-(-11.08)));
            yy = 51.4 + (((tickAnim - 24) / 1) * (56.7385-(51.4)));
            zz = -14.51 + (((tickAnim - 24) / 1) * (-6.26781-(-14.51)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -11.57885 + (((tickAnim - 25) / 6) * (-0.44065-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 25) / 6) * (9.99039-(56.7385)));
            zz = -6.26781 + (((tickAnim - 25) / 6) * (-0.03849-(-6.26781)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -0.44065 + (((tickAnim - 31) / 3) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 31) / 3) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 31) / 3) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -10.40439 + (((tickAnim - 34) / 3) * (-11.57885-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 34) / 3) * (56.7385-(44.27313)));
            zz = -25.50718 + (((tickAnim - 34) / 3) * (-6.26781-(-25.50718)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -11.57885 + (((tickAnim - 37) / 5) * (-2.67-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 37) / 5) * (19.34-(56.7385)));
            zz = -6.26781 + (((tickAnim - 37) / 5) * (-1.28-(-6.26781)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -2.67 + (((tickAnim - 42) / 1) * (-0.44065-(-2.67)));
            yy = 19.34 + (((tickAnim - 42) / 1) * (9.99039-(19.34)));
            zz = -1.28 + (((tickAnim - 42) / 1) * (-0.03849-(-1.28)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -0.44065 + (((tickAnim - 43) / 3) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 43) / 3) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 43) / 3) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -10.40439 + (((tickAnim - 46) / 2) * (-11.08-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 46) / 2) * (51.4-(44.27313)));
            zz = -25.50718 + (((tickAnim - 46) / 2) * (-14.51-(-25.50718)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = -11.08 + (((tickAnim - 48) / 1) * (-11.57885-(-11.08)));
            yy = 51.4 + (((tickAnim - 48) / 1) * (56.7385-(51.4)));
            zz = -14.51 + (((tickAnim - 48) / 1) * (-6.26781-(-14.51)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = -11.57885 + (((tickAnim - 49) / 6) * (-0.44065-(-11.57885)));
            yy = 56.7385 + (((tickAnim - 49) / 6) * (9.99039-(56.7385)));
            zz = -6.26781 + (((tickAnim - 49) / 6) * (-0.03849-(-6.26781)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.44065 + (((tickAnim - 55) / 3) * (-10.40439-(-0.44065)));
            yy = 9.99039 + (((tickAnim - 55) / 3) * (44.27313-(9.99039)));
            zz = -0.03849 + (((tickAnim - 55) / 3) * (-25.50718-(-0.03849)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -10.40439 + (((tickAnim - 58) / 2) * (-11.08-(-10.40439)));
            yy = 44.27313 + (((tickAnim - 58) / 2) * (51.4-(44.27313)));
            zz = -25.50718 + (((tickAnim - 58) / 2) * (-14.51-(-25.50718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.62 + (((tickAnim - 0) / 2) * (0-(0.62)));
            yy = 16.63 + (((tickAnim - 0) / 2) * (11-(16.63)));
            zz = -0.38 + (((tickAnim - 0) / 2) * (-0.00001-(-0.38)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 2) / 3) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 2) / 3) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.60716 + (((tickAnim - 5) / 3) * (2.31028-(0.60716)));
            yy = 15.05933 + (((tickAnim - 5) / 3) * (32.11205-(15.05933)));
            zz = -14.577 + (((tickAnim - 5) / 3) * (-1.41008-(-14.577)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 2.31028 + (((tickAnim - 8) / 6) * (0-(2.31028)));
            yy = 32.11205 + (((tickAnim - 8) / 6) * (11-(32.11205)));
            zz = -1.41008 + (((tickAnim - 8) / 6) * (-0.00001-(-1.41008)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 14) / 3) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 14) / 3) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.60716 + (((tickAnim - 17) / 1) * (1.34-(0.60716)));
            yy = 15.05933 + (((tickAnim - 17) / 1) * (22.37-(15.05933)));
            zz = -14.577 + (((tickAnim - 17) / 1) * (-8.93-(-14.577)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.34 + (((tickAnim - 18) / 2) * (2.31028-(1.34)));
            yy = 22.37 + (((tickAnim - 18) / 2) * (32.11205-(22.37)));
            zz = -8.93 + (((tickAnim - 18) / 2) * (-1.41008-(-8.93)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 2.31028 + (((tickAnim - 20) / 4) * (0.62-(2.31028)));
            yy = 32.11205 + (((tickAnim - 20) / 4) * (16.63-(32.11205)));
            zz = -1.41008 + (((tickAnim - 20) / 4) * (-0.38-(-1.41008)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0.62 + (((tickAnim - 24) / 2) * (0-(0.62)));
            yy = 16.63 + (((tickAnim - 24) / 2) * (11-(16.63)));
            zz = -0.38 + (((tickAnim - 24) / 2) * (-0.00001-(-0.38)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 26) / 3) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 26) / 3) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0.60716 + (((tickAnim - 29) / 3) * (2.31028-(0.60716)));
            yy = 15.05933 + (((tickAnim - 29) / 3) * (32.11205-(15.05933)));
            zz = -14.577 + (((tickAnim - 29) / 3) * (-1.41008-(-14.577)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 2.31028 + (((tickAnim - 32) / 6) * (0-(2.31028)));
            yy = 32.11205 + (((tickAnim - 32) / 6) * (11-(32.11205)));
            zz = -1.41008 + (((tickAnim - 32) / 6) * (-0.00001-(-1.41008)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 38) / 3) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 38) / 3) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0.60716 + (((tickAnim - 41) / 1) * (1.34-(0.60716)));
            yy = 15.05933 + (((tickAnim - 41) / 1) * (22.37-(15.05933)));
            zz = -14.577 + (((tickAnim - 41) / 1) * (-8.93-(-14.577)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 1.34 + (((tickAnim - 42) / 2) * (2.31028-(1.34)));
            yy = 22.37 + (((tickAnim - 42) / 2) * (32.11205-(22.37)));
            zz = -8.93 + (((tickAnim - 42) / 2) * (-1.41008-(-8.93)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 2.31028 + (((tickAnim - 44) / 4) * (0.62-(2.31028)));
            yy = 32.11205 + (((tickAnim - 44) / 4) * (16.63-(32.11205)));
            zz = -1.41008 + (((tickAnim - 44) / 4) * (-0.38-(-1.41008)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.62 + (((tickAnim - 48) / 2) * (0-(0.62)));
            yy = 16.63 + (((tickAnim - 48) / 2) * (11-(16.63)));
            zz = -0.38 + (((tickAnim - 48) / 2) * (-0.00001-(-0.38)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0.60716-(0)));
            yy = 11 + (((tickAnim - 50) / 3) * (15.05933-(11)));
            zz = -0.00001 + (((tickAnim - 50) / 3) * (-14.577-(-0.00001)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 0.60716 + (((tickAnim - 53) / 3) * (2.31028-(0.60716)));
            yy = 15.05933 + (((tickAnim - 53) / 3) * (32.11205-(15.05933)));
            zz = -14.577 + (((tickAnim - 53) / 3) * (-1.41008-(-14.577)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 2.31028 + (((tickAnim - 56) / 4) * (0.62-(2.31028)));
            yy = 32.11205 + (((tickAnim - 56) / 4) * (16.63-(32.11205)));
            zz = -1.41008 + (((tickAnim - 56) / 4) * (-0.38-(-1.41008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 21.25 + (((tickAnim - 0) / 2) * (16.73-(21.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 2) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 2) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.00001 + (((tickAnim - 6) / 3) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 6) / 3) * (17.97524-(0)));
            zz = -0.00003 + (((tickAnim - 6) / 3) * (-15.96276-(-0.00003)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.33038 + (((tickAnim - 9) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 9) / 3) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 9) / 3) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 22 + (((tickAnim - 12) / 2) * (16.73-(22)));
            zz = -0.00001 + (((tickAnim - 12) / 2) * (0-(-0.00001)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 14) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 14) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.00001 + (((tickAnim - 18) / 1) * (5.67-(-0.00001)));
            yy = 0 + (((tickAnim - 18) / 1) * (8.99-(0)));
            zz = -0.00003 + (((tickAnim - 18) / 1) * (-7.98-(-0.00003)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 5.67 + (((tickAnim - 19) / 2) * (11.33038-(5.67)));
            yy = 8.99 + (((tickAnim - 19) / 2) * (17.97524-(8.99)));
            zz = -7.98 + (((tickAnim - 19) / 2) * (-15.96276-(-7.98)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 11.33038 + (((tickAnim - 21) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 21) / 3) * (21.25-(17.97524)));
            zz = -15.96276 + (((tickAnim - 21) / 3) * (0-(-15.96276)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 21.25 + (((tickAnim - 24) / 2) * (16.73-(21.25)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 26) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 26) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -0.00001 + (((tickAnim - 30) / 3) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 30) / 3) * (17.97524-(0)));
            zz = -0.00003 + (((tickAnim - 30) / 3) * (-15.96276-(-0.00003)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 11.33038 + (((tickAnim - 33) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 33) / 3) * (22-(17.97524)));
            zz = -15.96276 + (((tickAnim - 33) / 3) * (-0.00001-(-15.96276)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = 22 + (((tickAnim - 36) / 2) * (16.73-(22)));
            zz = -0.00001 + (((tickAnim - 36) / 2) * (0-(-0.00001)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 38) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 38) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -0.00001 + (((tickAnim - 42) / 1) * (5.67-(-0.00001)));
            yy = 0 + (((tickAnim - 42) / 1) * (8.99-(0)));
            zz = -0.00003 + (((tickAnim - 42) / 1) * (-7.98-(-0.00003)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 5.67 + (((tickAnim - 43) / 2) * (11.33038-(5.67)));
            yy = 8.99 + (((tickAnim - 43) / 2) * (17.97524-(8.99)));
            zz = -7.98 + (((tickAnim - 43) / 2) * (-15.96276-(-7.98)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 11.33038 + (((tickAnim - 45) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 45) / 3) * (21.25-(17.97524)));
            zz = -15.96276 + (((tickAnim - 45) / 3) * (0-(-15.96276)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 21.25 + (((tickAnim - 48) / 2) * (16.73-(21.25)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (-0.00001-(0)));
            yy = 16.73 + (((tickAnim - 50) / 4) * (0-(16.73)));
            zz = 0 + (((tickAnim - 50) / 4) * (-0.00003-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = -0.00001 + (((tickAnim - 54) / 3) * (11.33038-(-0.00001)));
            yy = 0 + (((tickAnim - 54) / 3) * (17.97524-(0)));
            zz = -0.00003 + (((tickAnim - 54) / 3) * (-15.96276-(-0.00003)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 11.33038 + (((tickAnim - 57) / 3) * (0-(11.33038)));
            yy = 17.97524 + (((tickAnim - 57) / 3) * (21.25-(17.97524)));
            zz = -15.96276 + (((tickAnim - 57) / 3) * (0-(-15.96276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 0) / 3) * (-0.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 0) / 3) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.66376 + (((tickAnim - 3) / 2) * (8.27-(17.66376)));
            yy = -0.3851 + (((tickAnim - 3) / 2) * (6.82-(-0.3851)));
            zz = -21.80407 + (((tickAnim - 3) / 2) * (-9.88-(-21.80407)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 8.27 + (((tickAnim - 5) / 1) * (1.22707-(8.27)));
            yy = 6.82 + (((tickAnim - 5) / 1) * (9.96928-(6.82)));
            zz = -9.88 + (((tickAnim - 5) / 1) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 1.22707 + (((tickAnim - 6) / 1) * (0.98-(1.22707)));
            yy = 9.96928 + (((tickAnim - 6) / 1) * (7.98-(9.96928)));
            zz = -0.94378 + (((tickAnim - 6) / 1) * (-0.76-(-0.94378)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0.98 + (((tickAnim - 7) / 2) * (0.41-(0.98)));
            yy = 7.98 + (((tickAnim - 7) / 2) * (-1.51-(7.98)));
            zz = -0.76 + (((tickAnim - 7) / 2) * (-0.32-(-0.76)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.41 + (((tickAnim - 9) / 3) * (0-(0.41)));
            yy = -1.51 + (((tickAnim - 9) / 3) * (-19-(-1.51)));
            zz = -0.32 + (((tickAnim - 9) / 3) * (0.00001-(-0.32)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 12) / 2) * (-8.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 12) / 2) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 17.66376 + (((tickAnim - 14) / 2) * (15.32-(17.66376)));
            yy = -8.3851 + (((tickAnim - 14) / 2) * (2.67-(-8.3851)));
            zz = -21.80407 + (((tickAnim - 14) / 2) * (-18.82-(-21.80407)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 15.32 + (((tickAnim - 16) / 1) * (8.27-(15.32)));
            yy = 2.67 + (((tickAnim - 16) / 1) * (7.82-(2.67)));
            zz = -18.82 + (((tickAnim - 16) / 1) * (-9.88-(-18.82)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 8.27 + (((tickAnim - 17) / 1) * (1.22707-(8.27)));
            yy = 7.82 + (((tickAnim - 17) / 1) * (9.96928-(7.82)));
            zz = -9.88 + (((tickAnim - 17) / 1) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 1.22707 + (((tickAnim - 18) / 1) * (1.08-(1.22707)));
            yy = 9.96928 + (((tickAnim - 18) / 1) * (8.39-(9.96928)));
            zz = -0.94378 + (((tickAnim - 18) / 1) * (-0.83-(-0.94378)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 1.08 + (((tickAnim - 19) / 2) * (0.65-(1.08)));
            yy = 8.39 + (((tickAnim - 19) / 2) * (-0.35-(8.39)));
            zz = -0.83 + (((tickAnim - 19) / 2) * (-0.5-(-0.83)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0.65 + (((tickAnim - 21) / 3) * (0-(0.65)));
            yy = -0.35 + (((tickAnim - 21) / 3) * (-19-(-0.35)));
            zz = -0.5 + (((tickAnim - 21) / 3) * (0.00001-(-0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 24) / 3) * (-0.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 24) / 3) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 17.66376 + (((tickAnim - 27) / 2) * (8.27-(17.66376)));
            yy = -0.3851 + (((tickAnim - 27) / 2) * (6.82-(-0.3851)));
            zz = -21.80407 + (((tickAnim - 27) / 2) * (-9.88-(-21.80407)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 8.27 + (((tickAnim - 29) / 1) * (1.22707-(8.27)));
            yy = 6.82 + (((tickAnim - 29) / 1) * (9.96928-(6.82)));
            zz = -9.88 + (((tickAnim - 29) / 1) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 1.22707 + (((tickAnim - 30) / 1) * (0.98-(1.22707)));
            yy = 9.96928 + (((tickAnim - 30) / 1) * (7.98-(9.96928)));
            zz = -0.94378 + (((tickAnim - 30) / 1) * (-0.76-(-0.94378)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.98 + (((tickAnim - 31) / 2) * (0.41-(0.98)));
            yy = 7.98 + (((tickAnim - 31) / 2) * (-1.51-(7.98)));
            zz = -0.76 + (((tickAnim - 31) / 2) * (-0.32-(-0.76)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0.41 + (((tickAnim - 33) / 3) * (0-(0.41)));
            yy = -1.51 + (((tickAnim - 33) / 3) * (-19-(-1.51)));
            zz = -0.32 + (((tickAnim - 33) / 3) * (0.00001-(-0.32)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 36) / 2) * (-8.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 36) / 2) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 17.66376 + (((tickAnim - 38) / 2) * (15.32-(17.66376)));
            yy = -8.3851 + (((tickAnim - 38) / 2) * (2.67-(-8.3851)));
            zz = -21.80407 + (((tickAnim - 38) / 2) * (-18.82-(-21.80407)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 15.32 + (((tickAnim - 40) / 1) * (8.27-(15.32)));
            yy = 2.67 + (((tickAnim - 40) / 1) * (7.82-(2.67)));
            zz = -18.82 + (((tickAnim - 40) / 1) * (-9.88-(-18.82)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 8.27 + (((tickAnim - 41) / 1) * (1.22707-(8.27)));
            yy = 7.82 + (((tickAnim - 41) / 1) * (9.96928-(7.82)));
            zz = -9.88 + (((tickAnim - 41) / 1) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 1.22707 + (((tickAnim - 42) / 1) * (1.08-(1.22707)));
            yy = 9.96928 + (((tickAnim - 42) / 1) * (8.39-(9.96928)));
            zz = -0.94378 + (((tickAnim - 42) / 1) * (-0.83-(-0.94378)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 1.08 + (((tickAnim - 43) / 2) * (0.65-(1.08)));
            yy = 8.39 + (((tickAnim - 43) / 2) * (-0.35-(8.39)));
            zz = -0.83 + (((tickAnim - 43) / 2) * (-0.5-(-0.83)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0.65 + (((tickAnim - 45) / 3) * (0-(0.65)));
            yy = -0.35 + (((tickAnim - 45) / 3) * (-19-(-0.35)));
            zz = -0.5 + (((tickAnim - 45) / 3) * (0.00001-(-0.5)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (17.66376-(0)));
            yy = -19 + (((tickAnim - 48) / 3) * (-0.3851-(-19)));
            zz = 0.00001 + (((tickAnim - 48) / 3) * (-21.80407-(0.00001)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 17.66376 + (((tickAnim - 51) / 2) * (8.27-(17.66376)));
            yy = -0.3851 + (((tickAnim - 51) / 2) * (6.82-(-0.3851)));
            zz = -21.80407 + (((tickAnim - 51) / 2) * (-9.88-(-21.80407)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 8.27 + (((tickAnim - 53) / 1) * (1.22707-(8.27)));
            yy = 6.82 + (((tickAnim - 53) / 1) * (9.96928-(6.82)));
            zz = -9.88 + (((tickAnim - 53) / 1) * (-0.94378-(-9.88)));
        }
        else if (tickAnim >= 54 && tickAnim < 55) {
            xx = 1.22707 + (((tickAnim - 54) / 1) * (0.98-(1.22707)));
            yy = 9.96928 + (((tickAnim - 54) / 1) * (7.98-(9.96928)));
            zz = -0.94378 + (((tickAnim - 54) / 1) * (-0.76-(-0.94378)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 0.98 + (((tickAnim - 55) / 2) * (0.41-(0.98)));
            yy = 7.98 + (((tickAnim - 55) / 2) * (-1.51-(7.98)));
            zz = -0.76 + (((tickAnim - 55) / 2) * (-0.32-(-0.76)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0.41 + (((tickAnim - 57) / 3) * (0-(0.41)));
            yy = -1.51 + (((tickAnim - 57) / 3) * (-19-(-1.51)));
            zz = -0.32 + (((tickAnim - 57) / 3) * (0.00001-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

    }
}




