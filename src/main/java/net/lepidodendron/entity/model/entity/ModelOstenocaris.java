package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOstenocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer gillbase;
    private final AdvancedModelRenderer gillR1;
    private final AdvancedModelRenderer gillL1;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer gillL4;
    private final AdvancedModelRenderer gillL5;
    private final AdvancedModelRenderer gillL6;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer gillR4;
    private final AdvancedModelRenderer gillR5;
    private final AdvancedModelRenderer gillR6;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legRs3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legLs3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legRs4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legLs4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legRss5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer legLss5;

    public ModelOstenocaris() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.5799F, 1.1556F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.5F, -2.0799F, -5.4056F, 3, 5, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.9799F, -4.6056F, 5, 7, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -3.0799F, -4.5056F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 18, -3.0F, 0.1F, -3.025F, 4, 5, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 9.4201F, -1.1556F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 0, -0.5F, -11.4F, 3.35F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 26, -1.0F, -11.65F, -0.15F, 2, 2, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 9.4201F, -1.1556F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 7, -3.0F, -12.325F, -1.7F, 4, 6, 5, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-0.8F, 0.1701F, -6.9056F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.1309F, -0.0436F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 9, 26, -1.0F, -1.0F, -2.5F, 2, 2, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.eyeR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 24, -1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.eyeR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.8F, 0.1701F, -6.9056F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.1309F, 0.0436F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 9, 26, -1.0F, -1.0F, -2.5F, 2, 2, 5, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.eyeL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, -1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.eyeL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 0, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.gillbase = new AdvancedModelRenderer(this);
        this.gillbase.setRotationPoint(0.0F, 9.4201F, -1.1556F);
        this.body.addChild(gillbase);
        this.setRotateAngle(gillbase, -0.9163F, 0.0F, 0.0F);
        this.gillbase.cubeList.add(new ModelBox(gillbase, 0, 31, -1.0F, -9.75F, -5.75F, 2, 4, 2, 0.0F, false));

        this.gillR1 = new AdvancedModelRenderer(this);
        this.gillR1.setRotationPoint(0.0F, -7.0F, -4.05F);
        this.gillbase.addChild(gillR1);
        this.setRotateAngle(gillR1, 1.3963F, -0.0873F, 0.3927F);
        this.gillR1.cubeList.add(new ModelBox(gillR1, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillL1 = new AdvancedModelRenderer(this);
        this.gillL1.setRotationPoint(0.0F, -7.0F, -4.05F);
        this.gillbase.addChild(gillL1);
        this.setRotateAngle(gillL1, 1.3963F, 0.0873F, -0.3927F);
        this.gillL1.cubeList.add(new ModelBox(gillL1, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(0.0F, -7.5F, -4.05F);
        this.gillbase.addChild(gillL2);
        this.setRotateAngle(gillL2, 1.3963F, 0.0873F, -0.3927F);
        this.gillL2.cubeList.add(new ModelBox(gillL2, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(0.0F, -8.0F, -4.05F);
        this.gillbase.addChild(gillL3);
        this.setRotateAngle(gillL3, 1.3963F, 0.0873F, -0.3927F);
        this.gillL3.cubeList.add(new ModelBox(gillL3, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL4 = new AdvancedModelRenderer(this);
        this.gillL4.setRotationPoint(0.0F, -8.5F, -4.05F);
        this.gillbase.addChild(gillL4);
        this.setRotateAngle(gillL4, 1.3963F, 0.0873F, -0.3927F);
        this.gillL4.cubeList.add(new ModelBox(gillL4, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL5 = new AdvancedModelRenderer(this);
        this.gillL5.setRotationPoint(0.0F, -9.0F, -4.05F);
        this.gillbase.addChild(gillL5);
        this.setRotateAngle(gillL5, 1.3963F, 0.0873F, -0.3927F);
        this.gillL5.cubeList.add(new ModelBox(gillL5, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillL6 = new AdvancedModelRenderer(this);
        this.gillL6.setRotationPoint(0.0F, -9.5F, -4.05F);
        this.gillbase.addChild(gillL6);
        this.setRotateAngle(gillL6, 1.3963F, 0.0873F, -0.3927F);
        this.gillL6.cubeList.add(new ModelBox(gillL6, 0, 0, 0.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, true));

        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(0.0F, -7.5F, -4.05F);
        this.gillbase.addChild(gillR2);
        this.setRotateAngle(gillR2, 1.3963F, -0.0873F, 0.3927F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(0.0F, -8.0F, -4.05F);
        this.gillbase.addChild(gillR3);
        this.setRotateAngle(gillR3, 1.3963F, -0.0873F, 0.3927F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR4 = new AdvancedModelRenderer(this);
        this.gillR4.setRotationPoint(0.0F, -8.5F, -4.05F);
        this.gillbase.addChild(gillR4);
        this.setRotateAngle(gillR4, 1.3963F, -0.0873F, 0.3927F);
        this.gillR4.cubeList.add(new ModelBox(gillR4, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR5 = new AdvancedModelRenderer(this);
        this.gillR5.setRotationPoint(0.0F, -9.0F, -4.05F);
        this.gillbase.addChild(gillR5);
        this.setRotateAngle(gillR5, 1.3963F, -0.0873F, 0.3927F);
        this.gillR5.cubeList.add(new ModelBox(gillR5, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillR6 = new AdvancedModelRenderer(this);
        this.gillR6.setRotationPoint(0.0F, -9.5F, -4.05F);
        this.gillbase.addChild(gillR6);
        this.setRotateAngle(gillR6, 1.3963F, -0.0873F, 0.3927F);
        this.gillR6.cubeList.add(new ModelBox(gillR6, 0, 0, -1.0F, -0.75F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.75F, 2.9201F, -3.6556F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, -0.6981F, 0.2618F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 13, 12, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.75F, 2.9201F, -3.6556F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, -0.6981F, -0.2618F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 13, 12, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 2.6701F, -2.9056F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.7854F, 0.3054F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 2, 0, -0.5F, 0.25F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 2.6701F, -2.9056F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.7854F, -0.3054F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 2, 0, -0.5F, 0.25F, 0.0F, 1, 2, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 2.9201F, -2.3056F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.2182F, -0.0436F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 9, 24, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.legRs3 = new AdvancedModelRenderer(this);
        this.legRs3.setRotationPoint(-0.1F, 2.0F, -0.2F);
        this.legR3.addChild(legRs3);
        this.setRotateAngle(legRs3, -1.1345F, 0.0F, 0.0F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 19, 1, 0.0F, 0.0F, -1.5F, 0, 2, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 2.9201F, -2.3056F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.2182F, 0.0436F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 9, 24, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.legLs3 = new AdvancedModelRenderer(this);
        this.legLs3.setRotationPoint(0.1F, 2.0F, -0.2F);
        this.legL3.addChild(legLs3);
        this.setRotateAngle(legLs3, -1.1345F, 0.0F, 0.0F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 19, 1, 0.0F, 0.0F, -1.5F, 0, 2, 2, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.65F, 2.9201F, -2.0556F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.6109F, -0.0873F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 24, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.legRs4 = new AdvancedModelRenderer(this);
        this.legRs4.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.legR4.addChild(legRs4);
        this.setRotateAngle(legRs4, -1.3963F, 0.0F, 0.0F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 0, 0, 0.0F, 0.0F, -1.5F, 0, 3, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.65F, 2.9201F, -2.0556F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.6109F, 0.0873F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 24, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.legLs4 = new AdvancedModelRenderer(this);
        this.legLs4.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.legL4.addChild(legLs4);
        this.setRotateAngle(legLs4, -1.3963F, 0.0F, 0.0F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 0, 0, 0.0F, 0.0F, -1.5F, 0, 3, 2, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 2.6701F, -1.0556F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.7854F, -0.0873F, 0.0873F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 12, -0.5F, -1.0F, -0.75F, 1, 5, 1, 0.0F, false));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-0.5F, 4.0F, -0.2F);
        this.legR5.addChild(legRs5);
        this.setRotateAngle(legRs5, -1.789F, 0.0F, 0.0F);
        this.legRs5.cubeList.add(new ModelBox(legRs5, 15, 0, 0.0F, 0.0F, -0.5F, 1, 4, 1, -0.01F, false));

        this.legRss5 = new AdvancedModelRenderer(this);
        this.legRss5.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.legRs5.addChild(legRss5);
        this.setRotateAngle(legRss5, -0.5236F, 0.0F, 0.0F);
        this.legRss5.cubeList.add(new ModelBox(legRss5, 4, 11, 0.0F, -0.25F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 2.6701F, -1.0556F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.7854F, 0.0873F, -0.0873F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 12, -0.5F, -1.0F, -0.75F, 1, 5, 1, 0.0F, true));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(0.5F, 4.0F, -0.2F);
        this.legL5.addChild(legLs5);
        this.setRotateAngle(legLs5, -1.789F, 0.0F, 0.0F);
        this.legLs5.cubeList.add(new ModelBox(legLs5, 15, 0, -1.0F, 0.0F, -0.5F, 1, 4, 1, -0.01F, true));

        this.legLss5 = new AdvancedModelRenderer(this);
        this.legLss5.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.legLs5.addChild(legLss5);
        this.setRotateAngle(legLss5, -0.5236F, 0.0F, 0.0F);
        this.legLss5.cubeList.add(new ModelBox(legLss5, 4, 11, 0.0F, -0.25F, -0.5F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(20);
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }


    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.8F;
        this.body.offsetX = -0.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
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
        this.resetToDefaultPose();
        //this.body.offsetY = 1.1F;


        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {


            float speedLeg = 0.5F;
            float degreeLeg = 0.2F;
            if(f3 == 0.0F) {//not moving
                this.swing(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.swing(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legL5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.swing(legR5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);

            } else {


                this.legL4.rotateAngleX = -(float)Math.toRadians(-52.5);
                this.legLs4.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legR4.rotateAngleX = -(float)Math.toRadians(-52.5);
                this.legRs4.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legR5.rotateAngleX = -(float)Math.toRadians(-70);
                this.legRs5.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legRss5.rotateAngleX = -(float)Math.toRadians(40);
                this.legL5.rotateAngleX = -(float)Math.toRadians(-70);
                this.legLs5.rotateAngleX = -(float)Math.toRadians(132.5);
                this.legLss5.rotateAngleX = -(float)Math.toRadians(40);

                this.swing(legL4, speedLeg, degreeLeg*0.5F, false, 1.5F, -0.5F, f2, 0.7F);
                this.swing(legR4, speedLeg, degreeLeg*0.5F, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legL5, speedLeg, degreeLeg*0.5F, false, 2.0F, -0.5F, f2, 0.7F);
                this.swing(legR5, speedLeg, degreeLeg*0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            }

            this.flap(legL1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legR1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);


            this.bob(body, -speed, 0.3F, false, f2, 2);

            if(!e.isInWater()){
                this.body.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetX = -0.5F;
            }


        }
    }
}
