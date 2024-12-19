package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYanosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;

    public ModelYanosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.05F, 0.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -3.0F, -3.5F, 5, 6, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0F, -3.5F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 21, 10, -2.5F, 1.1F, -3.875F, 5, 4, 4, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.909F, -6.3644F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -1.0F, 0.0F, 0.0F, 3, 4, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 1.1235F, -5.8732F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -1.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.5221F, -3.9658F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 12, -2.0F, 0.0F, -2.0F, 3, 3, 2, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 28, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 5.75F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 19, -1.5F, -0.775F, -3.95F, 4, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, 2.7F, -3.875F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 25, 0.075F, -1.0F, -2.825F, 1, 2, 3, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.025F, -0.425F, -2.025F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, 2.7F, -3.875F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.025F, -0.425F, -2.025F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 25, -1.075F, -1.0F, -2.825F, 1, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 4.5902F, -3.7586F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.036F, -0.2055F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 0, -1.5F, -1.975F, -1.225F, 3, 1, 1, -0.003F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 25, -1.5F, -1.0F, -3.0F, 3, 1, 3, -0.002F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.025F, 5.0F, -0.625F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.8962F, 0.876F, -0.7652F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 38, 0.0F, -2.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.025F, 5.0F, -0.625F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.8962F, -0.876F, 0.7652F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 38, 0.0F, -2.5F, 0.0F, 0, 3, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, 3.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -0.85F, -0.5F, 4, 4, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 32, 0.0F, -2.85F, -0.5F, 0, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 4.9F, -0.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 19, -0.5F, -2.0F, 0.275F, 3, 2, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 3.9F, 0.0F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, -0.7418F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5F, 0.0F, -0.5F);
        this.backLeftFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 41, 2.5F, 0.0F, 0.275F, 0, 4, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 3.9F, 0.0F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, 0.7418F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5F, 0.0F, -0.5F);
        this.backRightFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 41, -2.5F, 0.0F, 0.275F, 0, 4, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1F, 5.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 25, 0, -1.5F, -0.85F, -0.5F, 3, 3, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 37, 4, 0.0F, -2.85F, 0.25F, 0, 2, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 3.15F, 0.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 37, 1.5F, 0.05F, -0.375F, 0, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 3.15F, 0.0F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 30, -0.5F, -1.95F, -0.375F, 2, 2, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.35F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 9, 35, -1.0F, -0.35F, 0.0F, 2, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 25, 0.0F, -3.85F, -0.5F, 0, 6, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.35F, -0.5F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7461F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 26, -1.0F, -0.5F, -0.5F, 1, 1, 4, 0.0F, false));

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
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.34F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.14F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
