package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGosfordia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGosfordia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer BackRightFin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer BackLeftFin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer FrontRightFin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer FrontLeftFin;
    private final AdvancedModelRenderer cube_r14;

    public ModelGosfordia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.0F, -0.5F);


        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.5F, -3.0F, -4.5F, 3, 6, 9, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 30, 28, 0.0F, -5.2F, -4.225F, 0, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.0F, 0.5F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, -2.0F, -0.25F, -5.075F, 3, 1, 8, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(-0.25F, 0.0F, -4.5F);
        this.Body.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 16, 0, -1.25F, -1.6F, -4.675F, 3, 3, 5, -0.001F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, 0.25F, -5.2F, -3.725F, 0, 4, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 26, 36, 0.25F, 0.55F, -4.025F, 0, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.75F, -2.0F, -3.0F);
        this.Tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 16, -2.0F, -0.3F, -1.6F, 3, 2, 5, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, 3.0F, 0.0F);
        this.Tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 24, -2.0F, -2.018F, -4.955F, 3, 2, 5, -0.002F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.287F, -0.4F, -4.0198F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.0436F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 19, 32, -0.0687F, -4.8F, -2.6985F, 0, 9, 3, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 36, 8, -1.0687F, -0.7F, -2.6485F, 2, 2, 2, 0.01F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(-0.0687F, 0.4F, -2.9235F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 26, 0.0F, -5.2F, -3.775F, 0, 9, 4, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 36, 13, -0.5F, -0.6F, -3.725F, 1, 1, 4, 0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Body.addChild(Head);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.0F, 4.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.6101F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, -2.0F, -0.425F, 0.625F, 2, 2, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.0F, 4.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6152F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 26, -2.0F, 0.125F, -0.75F, 2, 1, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 20, -2.0F, -1.95F, -2.625F, 2, 3, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4712F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 9, -2.0F, -2.675F, -3.6F, 2, 3, 4, 0.0F, false));

        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(-0.125F, 1.0F, -3.45F);
        this.Head.addChild(Eyes);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 25, 9, 0.375F, -1.75F, 6.0F, 1, 1, 1, -0.09F, false));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 15, 16, 0.25F, -1.75F, 6.0F, 1, 1, 1, 0.0F, false));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 25, 9, -1.125F, -1.75F, 6.0F, 1, 1, 1, -0.09F, true));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 15, 16, -1.0F, -1.75F, 6.0F, 1, 1, 1, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(1.0F, 0.95F, 3.3F);
        this.Head.addChild(Jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3622F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 28, -2.0F, -0.0435F, -0.1309F, 2, 1, 2, 0.0F, false));

        this.BackRightFin = new AdvancedModelRenderer(this);
        this.BackRightFin.setRotationPoint(1.3F, 2.5F, -4.3F);
        this.Body.addChild(BackRightFin);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.3F, 1.5F, 0.3F);
        this.BackRightFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7081F, -0.2008F, -0.1259F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 0, 0.3F, -2.3498F, -3.6374F, 0, 2, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3F, 0.0F, 0.05F);
        this.BackRightFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7081F, -0.2008F, -0.1259F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 0, -0.5F, -0.4776F, -3.043F, 1, 1, 3, 0.0F, false));

        this.BackLeftFin = new AdvancedModelRenderer(this);
        this.BackLeftFin.setRotationPoint(-1.3F, 2.5F, -4.3F);
        this.Body.addChild(BackLeftFin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.3F, 1.5F, 0.3F);
        this.BackLeftFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7081F, 0.2008F, 0.1259F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 0, -0.3F, -2.3498F, -3.6374F, 0, 2, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.3F, 0.0F, 0.05F);
        this.BackLeftFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7081F, 0.2008F, 0.1259F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 0, -0.5F, -0.4776F, -3.043F, 1, 1, 3, 0.0F, true));

        this.FrontRightFin = new AdvancedModelRenderer(this);
        this.FrontRightFin.setRotationPoint(1.0F, 2.75F, 3.9F);
        this.Body.addChild(FrontRightFin);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.FrontRightFin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.333F, -0.1393F, -0.4608F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 26, -0.05F, -1.7066F, -5.1826F, 0, 2, 6, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 36, -0.55F, -1.2066F, -3.6326F, 1, 1, 4, 0.0F, false));

        this.FrontLeftFin = new AdvancedModelRenderer(this);
        this.FrontLeftFin.setRotationPoint(-1.0F, 2.75F, 3.9F);
        this.Body.addChild(FrontLeftFin);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.FrontLeftFin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.333F, 0.1393F, 0.4608F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 26, 0.05F, -1.7066F, -5.1826F, 0, 2, 6, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 36, -0.45F, -1.2066F, -3.6326F, 1, 1, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }


    public void renderStaticWall(float f) {
        this.setRotateAngle(Tail2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r9, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r8, 0.3622F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.6152F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -1.6101F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 1.333F, 0.1393F, 0.4608F);
        this.setRotateAngle(cube_r13, 1.333F, -0.1393F, -0.4608F);
        this.setRotateAngle(cube_r12, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r11, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r10, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.18F;
        this.main.offsetZ = -0.098F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -0.6F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(3);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Tail3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r8, 0.3622F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.6152F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -1.6101F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 1.333F, 0.1393F, 0.4608F);
        this.setRotateAngle(cube_r13, 1.333F, -0.1393F, -0.4608F);
        this.setRotateAngle(cube_r12, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r11, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r10, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.088F, -0.1304F, -0.0115F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Tail3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Jaw, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r8, 0.3622F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.6152F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -1.6101F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 1.333F, 0.1393F, 0.4608F);
        this.setRotateAngle(cube_r13, 1.333F, -0.1393F, -0.4608F);
        this.setRotateAngle(cube_r12, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r11, 0.7081F, 0.2008F, 0.1259F);
        this.setRotateAngle(cube_r10, 0.7081F, -0.2008F, -0.1259F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.088F, -0.1304F, -0.0115F);
        this.main.offsetY = -0.3F;
        this.main.render(0.01F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3};
        float speed = 0.3F;
        float outOfWater = 1.0F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (!((EntityPrehistoricFloraGosfordia) e).isReallyInWater()) {
            outOfWater = 1.45f;
            this.main.bob(speed, 0.35F, false, f2, 1F);
            //this.main.offsetY = 1.1F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.main.rotateAngleY = (float) Math.toRadians(180);
            this.chainSwing(fishTail, speed * outOfWater, 0.4F * outOfWater, -3, f2, 1);
            this.swing(main, speed, 0.3F * outOfWater, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75 * outOfWater), (float)Math.toRadians(15) * outOfWater, false, 0, -0.2F, f2, 1);
            this.walk(FrontLeftFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.swing(FrontLeftFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.walk(FrontRightFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.swing(FrontRightFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.walk(BackLeftFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.swing(BackLeftFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.walk(BackRightFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
            this.swing(BackRightFin, (float) (speed * 0.75 * outOfWater), 0.2F * outOfWater, true, 0, 0, f2, 1);
        }
    }
}
