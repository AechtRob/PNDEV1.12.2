package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelExocoetoides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin2;
    private final AdvancedModelRenderer frontRightFin2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;

    public ModelExocoetoides() {
        this.textureWidth = 40;
        this.textureHeight = 35;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 6, -1.0F, -3.0F, -4.0F, 2, 3, 4, 0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, -0.2F, -3.75F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.088F, -0.2006F, 0.0973F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 0, 0.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, -0.2F, -3.75F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.088F, 0.2006F, -0.0973F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 0, -7.0F, 0.0F, 0.0F, 7, 0, 5, 0.0F, true));

        this.frontLeftFin2 = new AdvancedModelRenderer(this);
        this.frontLeftFin2.setRotationPoint(0.8743F, -0.2F, 0.2037F);
        this.main.addChild(frontLeftFin2);
        this.setRotateAngle(frontLeftFin2, 0.041F, -0.0884F, 0.2789F);
        this.frontLeftFin2.cubeList.add(new ModelBox(frontLeftFin2, 13, 13, 0.0F, 0.0F, -1.5F, 3, 0, 4, 0.0F, false));

        this.frontRightFin2 = new AdvancedModelRenderer(this);
        this.frontRightFin2.setRotationPoint(-0.8743F, -0.2F, 0.2037F);
        this.main.addChild(frontRightFin2);
        this.setRotateAngle(frontRightFin2, 0.041F, 0.0884F, -0.2789F);
        this.frontRightFin2.cubeList.add(new ModelBox(frontRightFin2, 13, 13, -3.0F, 0.0F, -1.5F, 3, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.0F, -3.875F);
        this.main.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.0F, -4.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2472F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, -0.684F, -1.8531F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 10, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 10, 0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.075F, -4.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 6, -1.0F, 0.0F, 2.0F, 2, 1, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.0F, -4.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.0F, -0.1F);
        this.head.addChild(jaw);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.0F, 0.1F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1004F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 24, -1.5F, -1.0F, -4.1F, 2, 1, 4, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.5449F, -0.0086F);
        this.main.addChild(tail);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4699F, -0.0164F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 18, -1.0F, -1.0F, 0.0F, 2, 1, 4, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.4302F, 0.0086F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 6, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6057F, 3.9984F);
        this.tail.addChild(tail2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5554F, 2.9637F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -0.5F, -1.0F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5745F, 0.0102F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 0, -0.5F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2745F, 3.0102F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 18, 0.0F, -1.125F, -0.175F, 0, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = -0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 5.0F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {


             if (!e.isInWater()) {
                 this.chainSwing(fishTail, speed*0.2f, 0.15F, 0, f2, 1);
                 this.swing(main, speed*0.2f, 0.3F, true, 0, 0, f2, 1);
                 this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

//                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetY = -0.10F;
//                this.bob(main, -speed, 5F, false, f2, 1);
            } else {
                 this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
                 this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

                 this.walk(frontLeftFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
//            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.walk(frontRightFin, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
//            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                 this.walk(frontLeftFin2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.swing(frontLeftFin2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.walk(frontRightFin2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
                 this.swing(frontRightFin2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

             }
        }
    }
}
