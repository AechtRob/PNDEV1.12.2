package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDentilepisosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer lip;
    private final AdvancedModelRenderer jaw;


    public ModelDentilepisosteus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.45F, -6.775F);
        this.main.cubeList.add(new ModelBox(main, 16, 0, -1.5F, -2.8F, 2.2F, 3, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 8, -0.5F, -2.2F, -6.2F, 1, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 14, -1.05F, -2.15F, 0.2F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 14, 0.05F, -2.15F, 0.2F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 17, -1.0F, -2.0F, -0.1F, 2, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 0, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.4F, -0.2F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 27, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.9F, -0.1F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 21, -1.0F, -3.0F, 2.0F, 2, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.05F, 0.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 27, -1.0F, -3.0F, 3.0F, 2, 1, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, 0.225F, 4.175F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.3927F, -0.1745F, 0.1309F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 10, 38, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, 0.225F, 4.175F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.3927F, 0.1745F, -0.1309F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 10, 38, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.75F, 6.8F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 16, 15, -1.0F, -1.85F, -0.1F, 2, 1, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.5F, -0.1F, 3, 4, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.475F, -3.275F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.096F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -1.0F, -3.0F, 3.0F, 2, 1, 5, 0.01F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 2.975F, 2.875F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6545F, -0.0873F, 0.1309F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 10, 30, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 2.975F, 2.875F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6545F, 0.0873F, -0.1309F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 10, 30, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.85F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -1.5F, -1.5F, -0.45F, 3, 4, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.225F, 0.575F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 21, -1.0F, -1.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.05F, -3.55F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0393F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 18, -1.0F, -3.025F, 3.0F, 2, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 4.525F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 28, 32, -1.0F, -1.25F, -0.475F, 2, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6F, 2.425F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 5, -1.0F, -2.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.75F, 2.525F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 37, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.85F, 0.175F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 9, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.55F, -0.725F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 33, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 2.525F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 30, -0.5F, -1.25F, -1.0F, 1, 3, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 8, 0.0F, -2.25F, 2.0F, 0, 5, 4, 0.0F, false));

        this.lip = new AdvancedModelRenderer(this);
        this.lip.setRotationPoint(0.0F, -1.2F, -3.8F);
        this.main.addChild(lip);
        this.lip.cubeList.add(new ModelBox(lip, 32, 5, -0.45F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));
        this.lip.cubeList.add(new ModelBox(lip, 32, 5, 0.45F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.0F, -0.95F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 33, -0.5F, -0.5F, -2.85F, 1, 1, 4, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
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
            this.chainSwing(fishTail, speed*0.3f, 0.25F, 3, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed*0.3f, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetY = -0.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
