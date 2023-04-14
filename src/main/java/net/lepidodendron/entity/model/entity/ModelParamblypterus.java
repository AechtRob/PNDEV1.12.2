package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParamblypterus extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer Jaw;

    public ModelParamblypterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 18, 13, -2.0F, -10.0F, -5.0F, 4, 6, 8, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-1.0F, -4.0F, 1.0F);
        this.Body.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.5236F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 4, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(1.0F, -4.0F, 1.0F);
        this.Body.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.5236F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -7.0F, 3.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 20, 0, -1.5F, -2.25F, -1.0F, 3, 5, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 12, 27, -1.0F, -2.0F, -1.0F, 2, 4, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 14, 30, 0.0F, -5.9F, -1.5F, 0, 4, 5, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 24, 28, 0.0F, 1.85F, -1.0F, 0, 4, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 30, 33, -0.5F, -1.25F, -1.0F, 1, 3, 4, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Body4.addChild(Tail);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 9, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.4F, -0.5F, 0, 8, 13, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -7.25F, -5.0F);
        this.Body.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 21, -2.0F, -0.75F, -3.5F, 4, 4, 4, 0.015F, false));
        this.Head.cubeList.add(new ModelBox(Head, 31, 0, -1.5F, -0.45F, -6.25F, 3, 2, 2, 0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -1.5F, 0.05F, -5.75F, 3, 1, 1, 0.025F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.625F, -6.45F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 27, -1.5F, -2.075F, 0.0F, 3, 2, 4, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -1.5F, -2.875F, 2.0F, 3, 1, 1, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, -1.5F, -0.5F, -7.6F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.75F, 0.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 6, -1.0F, 0.1F, -3.8F, 3, 2, 4, 0.01F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-2.0F, 2.25F, 0.5F);
        this.Head.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, -0.2618F, -0.5236F, 0.0F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 3, 0.0F, -1.25F, 0.0F, 0, 2, 4, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(2.0F, 2.25F, 0.5F);
        this.Head.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, -0.2618F, 0.5236F, 0.0F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 3, 0.0F, -1.25F, 0.0F, 0, 2, 4, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.125F, -3.45F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3491F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 11, 0, -1.0F, -0.875F, -3.0F, 2, 1, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.Body.offsetY = -0.13F;
        this.Body.offsetX = -0.06F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                //this.Body.offsetY = 0.58F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
