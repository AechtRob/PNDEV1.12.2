package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIowacystis extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer rside;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lside;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Arm;
    private final AdvancedModelRenderer Arm2;
    private final AdvancedModelRenderer Arm3;
    private final AdvancedModelRenderer Arm4;

    public ModelIowacystis() {
        this.textureWidth = 25;
        this.textureHeight = 23;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 23.5F, -4.0F);
        this.Root.cubeList.add(new ModelBox(Root, 16, 0, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.02F, false));
        this.Root.cubeList.add(new ModelBox(Root, 0, 5, -1.0F, -0.75F, -1.0F, 2, 1, 3, 0.0F, false));
        this.Root.cubeList.add(new ModelBox(Root, 0, 15, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.75F, -1.0F);
        this.Root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 18, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Root.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 8, 2, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 14, -0.5F, -0.49F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 14, 9, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 6, 12, -0.5F, -0.49F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 10, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.rside = new AdvancedModelRenderer(this);
        this.rside.setRotationPoint(-0.5F, 0.5F, -3.0F);
        this.Root.addChild(rside);
        this.setRotateAngle(rside, 0.0F, -0.5672F, 0.0F);
        this.rside.cubeList.add(new ModelBox(rside, 8, 7, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.rside.cubeList.add(new ModelBox(rside, 17, 5, 1.0F, -1.0F, 1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rside.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 3, 0.0F, false));

        this.lside = new AdvancedModelRenderer(this);
        this.lside.setRotationPoint(0.5F, 0.5F, -3.0F);
        this.Root.addChild(lside);
        this.setRotateAngle(lside, 0.0F, 0.5672F, 0.0F);
        this.lside.cubeList.add(new ModelBox(lside, 8, 7, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));
        this.lside.cubeList.add(new ModelBox(lside, 17, 5, -2.0F, -1.0F, 1.5F, 1, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.lside.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.0F, -1.01F, 0.0F, 2, 1, 3, 0.0F, true));

        this.Arm = new AdvancedModelRenderer(this);
        this.Arm.setRotationPoint(0.0F, 0.025F, -3.0F);
        this.Root.addChild(Arm);
        this.Arm.cubeList.add(new ModelBox(Arm, 0, 20, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Arm2 = new AdvancedModelRenderer(this);
        this.Arm2.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Arm.addChild(Arm2);
        this.Arm2.cubeList.add(new ModelBox(Arm2, 19, 19, -0.5F, -0.51F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Arm3 = new AdvancedModelRenderer(this);
        this.Arm3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Arm2.addChild(Arm3);
        this.Arm3.cubeList.add(new ModelBox(Arm3, 14, 19, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Arm4 = new AdvancedModelRenderer(this);
        this.Arm4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Arm3.addChild(Arm4);
        this.Arm4.cubeList.add(new ModelBox(Arm4, 18, 14, -0.5F, -0.51F, -1.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleX = (float) Math.toRadians(90);
        this.Root.offsetY = -0.2F;
        this.Root.offsetX = 0.0F;
        this.Root.offsetZ = -0.34F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, 0.13F, -0.05F, 0.0F);
        this.setRotateAngle(Tail4, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Tail5, -0.13F, -0.13F, 0.0F);
        this.setRotateAngle(Arm, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Arm2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Arm3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Arm4, 0.0F, -0.1F, 0.0F);
        this.Root.offsetY = 0.08F;
        this.Root.render(0.01F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] appendage = {this.Arm, this.Arm2, this.Arm3, this.Arm4};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                this.Root.offsetY = 0F;
                return;
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.bob(Root, -speed, 5F, false, f2, 1);
            }
            this.Root.offsetY = -0.15F;
            this.chainWave(fishTail, speed , 0.1F, 0, f2, 1);
            this.chainSwing(fishTail, speed, 0.26F, 5, f2, 1);
            this.chainSwing(appendage, speed/5, 0.4F, 0, f2, 1);


            //this.finR2.flap(speed * 6, (float)Math.toRadians(25), false, 0, (float)Math.toRadians(25), f2, 1F);

//            this.finL.swing(speed * 7, (float)Math.toRadians(35), false, 0, (float)Math.toRadians(35)*0.66F, f2, 1F);
//            this.finL2.swing(speed * 7, (float)Math.toRadians(35), false, 0, (float)Math.toRadians(35)*0.66F, f2, 1F);
//            this.finR.swing(speed * 7, -(float)Math.toRadians(35), false, 0, -(float)Math.toRadians(35)*0.66F, f2, 1F);
//            this.finR2.swing(speed * 7, -(float)Math.toRadians(35), false, 0, -(float)Math.toRadians(35)*0.66F, f2, 1F);

            this.swing(Root, speed, 0.06F, true, 0, 0, f2, 1);

        }
    }
}
