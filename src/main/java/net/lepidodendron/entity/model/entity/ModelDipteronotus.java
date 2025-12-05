package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDipteronotus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelDipteronotus() {
        this.textureWidth = 68;
        this.textureHeight = 65;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 16.7793F, -0.742F);
        this.body.cubeList.add(new ModelBox(body, 1, 0, -2.5F, -3.7793F, -4.258F, 5, 10, 7, 0.005F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 22, -2.0F, 5.5207F, 0.742F, 4, 2, 2, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.7793F, 0.342F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 15, -2.0F, 0.2774F, 0.0572F, 4, 2, 3, 0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.2793F, -4.158F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 7, 0.0F, -0.1F, -0.2F, 0, 3, 11, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.2793F, -4.158F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 43, -2.0F, -0.1F, -0.2F, 4, 2, 5, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 6.2207F, -4.258F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 42, -2.0F, -2.0F, 0.2F, 4, 2, 5, 0.0F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(2.0F, 6.9207F, 1.842F);
        this.body.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.4363F, -0.8727F, 1.0036F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 28, 15, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-2.0F, 6.9207F, 1.842F);
        this.body.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, 0.4363F, 0.8727F, -1.0036F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 28, 15, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(2.5F, 3.6207F, -3.958F);
        this.body.addChild(leftPectoral);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftPectoral.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1741F, -0.4242F, 0.7828F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 12, 0.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-2.5F, 3.6207F, -3.958F);
        this.body.addChild(rightPectoral);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightPectoral.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.1741F, 0.4242F, -0.7828F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 12, -7.0F, -1.0F, 0.0F, 7, 2, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.2207F, -4.258F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 0, -2.5F, -2.9F, -4.0F, 5, 6, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 46, -2.0F, -0.9F, -7.3F, 4, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.9923F, -2.1722F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6196F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 0, -2.0F, 0.0528F, -0.1863F, 4, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9F, -7.3F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5323F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 34, -2.0F, 0.0F, 0.0F, 4, 2, 6, -0.005F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, -7.3F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 8, -2.0F, -1.9F, 0.0F, 4, 2, 4, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 34, -2.5F, -1.8F, 0.0F, 5, 2, 5, -0.004F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.1F, -5.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 40, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.04F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 0, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.3F, -4.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 47, -1.5F, -0.2F, -3.3F, 3, 1, 4, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.2207F, 2.742F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 22, -2.5F, -2.0F, -1.0F, 5, 6, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 53, 0.0F, 3.3F, 2.2F, 0, 5, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 41, 53, -0.025F, -8.0F, 0.0F, 0, 6, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 17, -2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 6.2F, 0.0F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 26, -2.0F, -1.9F, 0.0F, 4, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 51, -1.5F, -2.0F, -1.0F, 3, 4, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, 0.0F, 1.8F, 0.2F, 0, 5, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 53, 0.0F, -10.3F, 0.0F, 0, 9, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 53, 0.0F, -7.3F, 3.0F, 0, 6, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 53, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2967F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 34, -1.0F, -0.9F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 50, -1.0F, -2.0F, -1.0F, 2, 4, 4, 0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 52, 38, -0.5F, -1.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail3.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 18, 0.0F, -3.1F, -1.0F, 0, 12, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = -1.34F;
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.03F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.body.offsetZ = -0.0F;
        this.body.offsetY = -0.05F;
        this.body.offsetX = 0.005F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.2F;
        this.body.offsetX = 1.2F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 4.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.Dapedium.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(leftPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(rightPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(rightPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(leftPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(leftPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(rightPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(rightPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(270);
                //this.Dapedium.offsetY = 1.15F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
