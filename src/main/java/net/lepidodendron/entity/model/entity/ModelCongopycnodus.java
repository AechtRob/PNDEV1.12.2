package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCongopycnodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Congopycnodus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body5;

    public ModelCongopycnodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Congopycnodus = new AdvancedModelRenderer(this);
        this.Congopycnodus.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -6.0F, -1.0F);
        this.Congopycnodus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 15, 14, -1.5F, -4.0F, -4.0F, 3, 9, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.0845F, -5.441F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5498F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 40, -1.0F, -0.9811F, -0.0464F, 2, 1, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.3F, -5.1F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 24, -1.0F, -0.0235F, -0.074F, 2, 5, 4, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 39, -0.5F, -6.0F, 0.0F, 1, 3, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 7, -1.0F, -3.0F, 0.0F, 2, 5, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4276F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 15, -1.0F, -1.0F, 0.2F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9F, -4.5F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 11, -1.5F, -1.6007F, 0.1185F, 3, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.8F, -4.2F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1745F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 31, -1.0F, -0.0155F, -2.941F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9845F, -2.941F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 34, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, -6.0F, 0.0F, 4, 12, 5, 0.02F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(2.0F, 2.5F, 0.0F);
        this.Body1.addChild(pectoralL);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5672F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.pectoralR = new AdvancedModelRenderer(this);
        this.pectoralR.setRotationPoint(-2.0F, 2.5F, 0.0F);
        this.Body1.addChild(pectoralR);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5672F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 18, -2.0F, -4.0F, -1.0F, 4, 9, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 17, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.0F, 4.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.0472F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 34, 0.0F, -3.0F, -3.8F, 0, 4, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 28, -1.5F, -2.0F, 0.0F, 3, 2, 3, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0472F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 37, 0.0F, -2.0F, -4.6F, 0, 4, 3, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 19, 0, -1.5F, -3.0F, -1.0F, 3, 7, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.4F, 0.5F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7505F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 37, -1.0F, -0.0262F, 0.0159F, 2, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 6, -1.0F, -1.6F, 0.4F, 2, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.0472F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 31, 0.0F, -1.0F, -0.8F, 0, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.0472F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 0, 0.0F, -1.0F, -1.6F, 0, 2, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 39, 23, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.0472F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 42, 0.0F, -1.0F, 0.4F, 0, 1, 2, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 34, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0472F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 11, 0.0F, 0.0F, 0.2F, 0, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 0, -1.0F, -2.0F, 0.0F, 2, 2, 3, -0.002F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 36, 31, -0.5F, -0.5F, -1.0F, 1, 2, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 18, 39, 0.0F, -1.5F, 1.0F, 0, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Congopycnodus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Congopycnodus.offsetY = -0.4F;
        this.Congopycnodus.offsetX = 0.2F;
        this.Congopycnodus.offsetZ = 2.0F;
        this.Congopycnodus.rotateAngleY = (float)Math.toRadians(120);
        this.Congopycnodus.rotateAngleX = (float)Math.toRadians(1);
        this.Congopycnodus.rotateAngleZ = (float)Math.toRadians(0);
        this.Congopycnodus.scaleChildren = true;
        float scaler = 3.4F;
        this.Congopycnodus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Congopycnodus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Head, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.12F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.14F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.14F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.16F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.16F, 0.0F);
        //End of pose, now render the model:
        this.Congopycnodus.render(f);
        //Reset rotations, positions and sizing:
        this.Congopycnodus.setScale(1.0F, 1.0F, 1.0F);
        this.Congopycnodus.scaleChildren = false;
        resetToDefaultPose();

    }

//    public void renderStaticWall(float f) {
//        this.setRotateAngle(Congopycnodus, 0.0F, 1.5F, 0.0F);
//        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
//        this.Congopycnodus.offsetY = -0.18F;
//        this.Congopycnodus.offsetZ = 0.02F;
//        this.Congopycnodus.render(0.01F);
//        resetToDefaultPose();
//    }
//    public void renderStaticFloor(float f) {
//        this.setRotateAngle(Congopycnodus, -0.25F, 0.0F, 0.0F);
//        this.setRotateAngle(Head, 0.0F, 0.12F, 0.0F);
//        this.setRotateAngle(Body1, 0.0F, 0.12F, 0.0F);
//        this.setRotateAngle(Body2, 0.0F, 0.14F, 0.0F);
//        this.setRotateAngle(Body3, 0.0F, 0.14F, 0.0F);
//        this.setRotateAngle(Body4, 0.0F, 0.16F, 0.0F);
//        this.setRotateAngle(Body5, 0.0F, 0.16F, 0.0F);
//        this.Congopycnodus.offsetY = -0.4F;
//        this.Congopycnodus.render(0.018f);
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Congopycnodus.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(pectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Congopycnodus, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Congopycnodus.rotateAngleZ = (float) Math.toRadians(90);
                //this.Congopycnodus.offsetY = 0.58F;
                this.bob(Congopycnodus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
