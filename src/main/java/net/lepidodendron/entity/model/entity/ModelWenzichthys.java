package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWenzichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightPelvicFin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftPelvicFin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightPectoralFin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftPectoralFin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;

    public ModelWenzichthys() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 20.3469F, -3.8006F);
        this.head.cubeList.add(new ModelBox(head, 0, 9, -1.0F, -0.2869F, -2.9244F, 2, 2, 3, 0.005F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5259F, -1.6867F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3665F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 3, -1.0F, -0.5F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0881F, -2.7244F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 23, -1.0F, -0.425F, -0.5F, 2, 1, 1, 0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0609F, -3.6757F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8644F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 20, -1.0F, 0.0316F, 0.0049F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0881F, -2.7244F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 11, -1.0F, -0.6F, -1.3F, 2, 1, 2, -0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.89F, -2.907F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0087F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.4F, 0.2F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 0, -2.0F, -0.55F, -0.6F, 2, 1, 1, -0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.3132F, -0.2924F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 15, -1.3F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 6, -0.7F, -0.5F, -1.0F, 1, 1, 1, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.076F, -1.4263F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.4228F, 0.8269F, 2, 3, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5528F, 1.0538F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 20, -1.0F, -0.905F, -1.0F, 2, 2, 1, -0.005F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.7529F, 5.2139F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9425F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, 0.0F, -0.3F, -0.7F, 0, 2, 2, 0.0F, false));

        this.rightPelvicFin = new AdvancedModelRenderer(this);
        this.rightPelvicFin.setRotationPoint(-1.0F, 1.5173F, 4.5257F);
        this.body.addChild(rightPelvicFin);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.rightPelvicFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1578F, -0.0114F, 0.1304F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 26, 0.0F, -0.6F, -0.8F, 0, 1, 1, 0.0F, true));

        this.leftPelvicFin = new AdvancedModelRenderer(this);
        this.leftPelvicFin.setRotationPoint(1.0F, 1.5173F, 4.5257F);
        this.body.addChild(leftPelvicFin);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.leftPelvicFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1578F, 0.0114F, -0.1304F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 26, 0.0F, -0.6F, -0.8F, 0, 1, 1, 0.0F, false));

        this.rightPectoralFin = new AdvancedModelRenderer(this);
        this.rightPectoralFin.setRotationPoint(-0.95F, 1.4539F, 1.4605F);
        this.body.addChild(rightPectoralFin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.05F, -0.1F, 0.1F);
        this.rightPectoralFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3518F, -0.123F, 0.045F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 25, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.leftPectoralFin = new AdvancedModelRenderer(this);
        this.leftPectoralFin.setRotationPoint(0.95F, 1.4539F, 1.4605F);
        this.body.addChild(leftPectoralFin);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.05F, -0.1F, 0.1F);
        this.leftPectoralFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3518F, 0.123F, -0.045F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 25, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0041F, 5.2868F);
        this.body.addChild(tail1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6563F, 2.3957F);
        this.tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 0, -0.75F, -1.6F, -2.0F, 1, 2, 3, -0.005F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 9, -0.25F, -1.6F, -2.0F, 1, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.6901F, 2.3239F);
        this.tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 20, -0.75F, -0.5F, -2.0F, 1, 1, 3, 0.002F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 6, -0.25F, -0.5F, -2.0F, 1, 1, 3, 0.015F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.305F, 0.0337F, 0.0935F);
        this.tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 25, -0.5F, -1.475F, -0.5F, 1, 3, 1, -0.075F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 24, -1.11F, -1.475F, -0.5F, 1, 3, 1, -0.07F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.2429F, 3.027F);
        this.tail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7418F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 26, 1.0F, -0.8F, -0.4F, 0, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1283F, 3.1674F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 7, 15, -0.5F, -0.95F, -0.4F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.25F, 0.7845F, -0.7717F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 15, -0.25F, -0.6F, 0.475F, 1, 1, 3, -0.005F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2987F, 2.3596F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 15, 0.0F, -1.925F, -0.5F, 0, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -2.0F;
        this.head.offsetX = -1.338F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.63F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetZ = -0.34F;
        this.head.offsetY = -0.18F;
        this.head.offsetX = -0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.head.offsetY = -0.14F;
        this.head.offsetZ = 0.015F;
        this.head.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(leftPectoralFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftPectoralFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(rightPectoralFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(rightPectoralFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(leftPelvicFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(leftPelvicFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(rightPelvicFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(rightPelvicFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(head, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = -0.1F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
