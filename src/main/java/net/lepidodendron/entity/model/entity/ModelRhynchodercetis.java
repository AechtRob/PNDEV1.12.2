package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhynchodercetis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;

    public ModelRhynchodercetis() {
        this.textureWidth = 55;
        this.textureHeight = 51;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.5F, 5.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 9, -1.5F, -1.0F, -2.5F, 3, 2, 5, 0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.5F, 4.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 31, -2.0F, -0.659F, -14.5605F, 3, 2, 4, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 38, -0.25F, -0.3188F, -15.5801F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 38, -1.75F, -0.3188F, -15.5801F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.5776F, -7.5283F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 20, -1.0F, -1.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 1.9962F, -14.5138F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 0, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.8391F, -10.5169F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0393F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 36, -0.5F, -1.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.0F, -6.75F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 38, -1.0F, 1.5F, -4.0F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.5552F, -18.4667F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 41, -1.0F, -0.85F, 0.075F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2945F, -18.4444F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 0.0F, -6.925F, 1, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.5747F, -15.5131F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.096F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 36, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.659F, -14.5605F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.675F, -10.75F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 29, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, 0.825F, -9.25F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.7828F, 0.4242F, -0.3887F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 33, 42, 0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0F, 0.825F, -9.25F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.7828F, -0.4242F, 0.3887F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 33, 42, 0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.7913F, -15.4085F);
        this.body.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.236F, -2.9582F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 42, -1.0F, 0.15F, -0.025F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.926F, -2.5134F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0262F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 0, -0.5F, -1.0F, -6.0F, 1, 1, 6, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 8, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 31, -1.0F, -1.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 0.488F, 3.196F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.4606F, 0.3152F, -0.1526F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 43, 14, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 0.488F, 3.196F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.4606F, -0.3152F, 0.1526F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 43, 14, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.0003F, 3.8101F);
        this.tail2.addChild(tail3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.9994F, -0.0538F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 24, -1.0F, -1.0F, 0.0F, 2, 1, 5, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.0006F, -0.0538F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 29, 0.5F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0253F, -0.0101F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 17, -1.0F, 0.0F, -0.025F, 2, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.0219F, 4.4682F);
        this.tail3.addChild(tail4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.7284F, 0.0217F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0305F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 22, -1.0F, -1.0F, 0.0F, 2, 1, 5, -0.009F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7716F, 0.0217F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.048F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 15, -1.0F, 0.0F, 0.0F, 2, 1, 5, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0284F, 4.5217F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.tail6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.829F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 43, 0.0F, -1.0F, -0.25F, 0, 1, 4, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 24, 0.0F, -2.0F, 0.75F, 0, 1, 3, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.05F, 4.5F);
        this.tail7.addChild(tail8);
        this.tail8.cubeList.add(new ModelBox(tail8, 0, 17, 0.0F, -2.45F, 0.0F, 0, 5, 6, 0.0F, false));

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
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed * 0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 0.1F, 0.1F, -3, f2, 1);
                return;
            }

            this.walk(jaw, (float) (speed * 0.75), 0.2F, false, 0, 0.14f, f2, 1);

            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.flap(frontLeftFin, speed * 2.5F, 0.3F, false, 0, 0, f2, 1);
            this.flap(frontRightFin, speed * 2.5F, -0.3F, false, 0, 0, f2, 1);
            this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);

            this.flap(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);

        }
    }
}
