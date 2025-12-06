package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelXiushanosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer leftspike;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightspike;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftpelvic;
    private final AdvancedModelRenderer rightpelvic;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;

    public ModelXiushanosteus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, -4.5F, 4, 1, 3, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 14, -1.0F, -1.0F, -7.0F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 5, -0.5F, -1.0F, -7.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.1F, -0.5F, -6.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.3526F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 5, -1.973F, -0.5F, 0.0117F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.1F, -0.5F, -6.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.3526F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 5, -0.027F, -0.5F, 0.0117F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -2.4F, -0.5F, -0.3F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6545F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, 0.4F, -0.5F, -0.3F, 2, 1, 1, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.375F, -4.1F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 18, -0.5F, 0.0F, 2.075F, 1, 1, 1, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 19, -1.0F, 0.0F, 0.075F, 2, 1, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.75F, -4.25F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 19, -0.375F, -0.375F, -0.8F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.75F, -4.25F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 19, -0.625F, -0.375F, -0.8F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8215F, -0.5915F, -6.4637F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1567F, 0.6575F, 0.0216F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.8215F, -0.5915F, -6.4637F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1567F, -0.6575F, -0.0216F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(1.9F, -0.2F, -4.25F);
        this.head.addChild(leftpectoral);
        this.setRotateAngle(leftpectoral, 0.0F, 0.5236F, 0.0F);
        this.leftpectoral.cubeList.add(new ModelBox(leftpectoral, 20, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-1.9F, -0.2F, -4.25F);
        this.head.addChild(rightpectoral);
        this.setRotateAngle(rightpectoral, 0.0F, -0.5236F, 0.0F);
        this.rightpectoral.cubeList.add(new ModelBox(rightpectoral, 20, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.leftspike = new AdvancedModelRenderer(this);
        this.leftspike.setRotationPoint(2.075F, -0.5F, -4.65F);
        this.head.addChild(leftspike);
        this.setRotateAngle(leftspike, 0.0F, 0.0436F, 0.2182F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 0.0F, -0.5F);
        this.leftspike.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.8727F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 11, -0.3074F, -0.075F, -0.2107F, 4, 0, 2, 0.0F, false));

        this.rightspike = new AdvancedModelRenderer(this);
        this.rightspike.setRotationPoint(-2.075F, -0.5F, -4.65F);
        this.head.addChild(rightspike);
        this.setRotateAngle(rightspike, 0.0F, -0.0436F, -0.2182F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, 0.0F, -0.5F);
        this.rightspike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.8727F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 11, -3.6926F, -0.075F, -0.2107F, 4, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.8566F, -2.2213F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 5, -1.5F, -0.1434F, 0.0713F, 3, 1, 3, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.2434F, 2.5713F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -0.55F, -0.675F, 0, 1, 1, 0.0F, false));

        this.leftpelvic = new AdvancedModelRenderer(this);
        this.leftpelvic.setRotationPoint(1.3F, 0.7316F, 1.1963F);
        this.body2.addChild(leftpelvic);
        this.setRotateAngle(leftpelvic, -0.0436F, 0.9599F, 0.0F);
        this.leftpelvic.cubeList.add(new ModelBox(leftpelvic, 19, 14, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.rightpelvic = new AdvancedModelRenderer(this);
        this.rightpelvic.setRotationPoint(-1.3F, 0.7316F, 1.1963F);
        this.body2.addChild(rightpelvic);
        this.setRotateAngle(rightpelvic, -0.0436F, -0.9599F, 0.0F);
        this.rightpelvic.cubeList.add(new ModelBox(rightpelvic, 19, 14, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0289F, 2.6016F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 0, -1.0F, -0.1724F, -0.0304F, 2, 1, 3, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.6724F, 2.4696F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 23, 0.0F, -0.55F, -0.5F, 0, 2, 1, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2077F, 2.8016F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.1199F, 0.168F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 5, 0.0F, -0.55F, -0.175F, 0, 2, 5, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 18, -0.5F, -0.55F, -0.175F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -0.4F;
        this.root.rotateAngleY = (float)Math.toRadians(242);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetZ = -0.34F;
        this.root.offsetY = -0.18F;
        this.root.offsetX = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.4F, 0.0F);
        this.root.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);

            this.flap(leftpectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(rightpectoral, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(rightpectoral, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(leftpelvic, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(leftpelvic, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(rightpelvic, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(rightpelvic, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = -0.1F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
