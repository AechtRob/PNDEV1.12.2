package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPlectocretacicus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer dorsalFin;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer analFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r18;

    public ModelPlectocretacicus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.8F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -5.05F, -0.9F, 3, 4, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -5.9971F, 0.4674F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -0.5F, 0.0F, -1.0F, 3, 2, 4, -0.005F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -5.5598F, -2.3749F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 13, -0.5F, 0.075F, 0.0F, 3, 4, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.374F, 0.3116F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -0.5F, -1.975F, -0.05F, 3, 2, 1, -0.015F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.003F, 0.4031F, 0.2882F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 7, -0.5F, -2.0F, 0.3F, 3, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.9928F, -1.934F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5585F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 20, -1.5F, -1.3F, 0.35F, 3, 3, 1, -0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.2042F, -0.5189F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 20, -1.5F, -0.5F, -1.0F, 3, 2, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -1.0818F, 2.3067F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 0, 0.2F, -0.5F, 0.6F, 0, 1, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 0, 2.8F, -0.5F, 0.6F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -2.4F, -0.25F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1787F, -0.2148F, -0.0385F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 16, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -2.4F, -0.25F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1787F, 0.2148F, 0.0385F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 16, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5058F, -2.25F, -0.7948F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.48F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 10, 0.0046F, -0.3F, -0.1545F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5058F, -2.25F, -0.7948F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.48F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 10, -0.0046F, -0.3F, -0.1545F, 0, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(head);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -3.8509F, -3.5499F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 7, -1.65F, 0.0F, -0.3F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 7, -0.35F, 0.0F, -0.3F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.55F, -2.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8116F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 25, -0.5F, -1.975F, -3.75F, 2, 2, 1, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, -0.5F, -1.975F, -3.5F, 2, 2, 4, 0.005F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.6313F, -3.6405F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 25, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.005F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 16, -1.0F, 0.2F, 0.0F, 2, 4, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.071F, -3.4301F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.7967F, -0.4035F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -2.8798F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 13, -1.0F, -2.1F, -0.55F, 2, 2, 1, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 25, -0.5F, -4.0F, 2.5F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.5F, 4.0F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 17, -0.5F, -1.6F, -0.8F, 1, 1, 1, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.5F, 4.0F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 4, -0.5F, 0.6F, -0.8F, 1, 1, 1, -0.01F, false));

        this.dorsalFin = new AdvancedModelRenderer(this);
        this.dorsalFin.setRotationPoint(0.0F, -4.25F, 3.25F);
        this.tail.addChild(dorsalFin);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.dorsalFin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9163F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 29, 0.0F, -0.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.analFin = new AdvancedModelRenderer(this);
        this.analFin.setRotationPoint(0.0F, -2.65F, 3.05F);
        this.tail.addChild(analFin);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.4F, 0.7F);
        this.analFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.1781F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 27, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, -3.5F, 4.4142F);
        this.tail.addChild(tail2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.4142F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7854F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 27, 0.5F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
