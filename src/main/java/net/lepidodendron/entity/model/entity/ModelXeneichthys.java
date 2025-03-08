package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelXeneichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelXeneichthys() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 17.8054F, 1.4536F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -3.5367F, -1.8742F, 4, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.4633F, 1.1258F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 16, -1.5F, -2.0F, -3.0F, 3, 2, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -3.5367F, -1.8742F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 19, -0.5F, 0.0F, -3.0F, 3, 5, 3, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 6.2453F, -1.7106F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2741F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 22, -1.0F, -2.0F, 0.0F, 3, 2, 2, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 5, -0.5F, -3.975F, 0.0F, 2, 2, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 6.2453F, -1.7106F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.7017F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 27, -1.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.7765F, -5.8978F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 32, -1.0F, 0.0F, -1.0F, 2, 4, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 7, -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(1.5F, -0.15F, -3.5F);
        this.head.addChild(eye2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 34, -0.25F, 0.5F, -2.3F, 1, 2, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, -0.15F, 0.95F, -1.775F, 1, 1, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, -0.15F, -3.5F);
        this.head.addChild(eye);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -0.75F, 0.5F, -2.3F, 1, 2, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, -0.85F, 0.95F, -1.775F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.0319F, -5.4155F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -4.2358F, -0.4365F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 32, -1.0F, 0.0F, -1.65F, 2, 4, 1, -0.002F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.2764F, 5.0191F, -2.4581F);
        this.head.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.829F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0726F, -0.5025F);
        this.frontleftfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.7017F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 28, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-0.2764F, 5.0191F, -2.4581F);
        this.head.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.829F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0726F, -0.5025F);
        this.frontrightfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.7017F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 28, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4726F, 2.6255F);
        this.main.addChild(tail);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.95F, 0.0F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3229F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 23, 0.5F, -0.35F, -0.675F, 0, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 3.95F, 0.0F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2356F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -0.5F, -1.975F, 0.2F, 3, 2, 4, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.5F, -1.8F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 11, -0.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.0499F, 3.5044F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -1.0F, -0.5F, 0.0F, 2, 3, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 1.0F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 10, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 11, 0.5F, -5.0F, 0.0F, 0, 10, 5, 0.0F, false));

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
        this.main.offsetX = 0.50F;
        this.main.rotateAngleY = (float)Math.toRadians(250);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.25F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);



            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
