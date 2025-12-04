package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelArduafrons extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Arduafrons;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body5;

    public ModelArduafrons() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Arduafrons = new AdvancedModelRenderer(this);
        this.Arduafrons.setRotationPoint(0.0F, 15.0F, 1.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Arduafrons.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 50, -2.5F, -3.6F, -7.0F, 4, 8, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 34, -3.0F, -4.0F, -4.0F, 5, 9, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 11, 61, -2.0F, 0.7F, -11.0F, 3, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 21, 3, -1.5F, -0.3F, -8.0F, 2, 1, 1, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 8.2F, -4.1F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5585F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 50, -1.5F, -5.0089F, 0.0452F, 2, 5, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.7F, -8.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8552F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 17, -1.5F, -5.0F, 0.0F, 2, 5, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.9F, -1.9F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.2741F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 0, -1.5F, -0.1906F, -0.605F, 2, 3, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.6F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 17, -2.0F, 0.0F, 0.0F, 3, 6, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.6F, -7.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9774F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 35, -1.5F, 0.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 7.63F, -9.76F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, -2.5F, -10.7224F, 1.6959F, 4, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.7F, -7.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 63, 61, -2.0F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Arduafrons.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.5F, -10.0F, 0.0F, 6, 22, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -12.6F, 1.8F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5934F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 10, -1.5F, 0.2F, -2.0F, 2, 3, 2, -0.01F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.5F, 5.0F, 1.0F);
        this.Body1.addChild(PectoralL);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 55, 0.0F, -3.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.5F, 5.0F, 1.0F);
        this.Body1.addChild(PectoralR);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 55, 0.0F, -3.0F, 0.0F, 0, 5, 5, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 28, 0, -3.0F, -8.0F, 0.0F, 5, 19, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 53, -2.0F, -3.0F, 0.0F, 3, 3, 4, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -10.0F, 0.0F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 34, -2.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 30, -2.0F, -6.0F, 0.0F, 3, 15, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 11.4F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5585F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 60, -0.5F, 0.2F, 0.7F, 0, 5, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 0, -1.5F, -2.8F, 0.7F, 2, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -8.7F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5934F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 41, -0.5F, -4.3F, -1.5F, 0, 5, 8, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 44, -1.5F, -0.3F, 0.5F, 2, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 2.0F, 3.8F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 52, 61, -2.0F, -4.0F, 0.0F, 3, 7, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 62, -0.5F, -5.3F, 1.8F, 0, 5, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1694F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 26, -0.51F, -0.9F, -2.1F, 0, 6, 8, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 10, -1.5F, -3.9F, -0.1F, 2, 4, 5, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -8.0F, 0.6F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 23, -0.51F, -3.9612F, -1.7092F, 0, 4, 6, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 20, -1.5F, 0.0388F, 0.2908F, 2, 3, 4, -0.011F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.9F, 1.8F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 64, 8, -1.5F, -2.0F, 0.0F, 2, 3, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 43, 41, -0.49F, -7.0F, 2.0F, 0, 13, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Arduafrons.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Arduafrons.offsetY = -0.5F;
        this.Arduafrons.offsetX = 0.1F;
        this.Arduafrons.rotateAngleY = (float)Math.toRadians(120);
        this.Arduafrons.rotateAngleX = (float)Math.toRadians(1);
        this.Arduafrons.rotateAngleZ = (float)Math.toRadians(0);
        this.Arduafrons.scaleChildren = true;
        float scaler = 2.0F;
        this.Arduafrons.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Arduafrons, 0.2F, 4.2F, 0.0F);
        this.setRotateAngle(cube_r1, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.8552F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 1.2741F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.9774F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r12, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r14, 1.1694F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3054F, 0.0F);
        //End of pose, now render the model:
        this.Arduafrons.render(f);
        //Reset rotations, positions and sizing:
        this.Arduafrons.setScale(1.0F, 1.0F, 1.0F);
        this.Arduafrons.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Arduafrons.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.Arduafrons.offsetY = -0.13F;
        this.Arduafrons.offsetX = -0.06F;
        this.Arduafrons.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Arduafrons, 0.7418F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.8552F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 1.2741F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.9774F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r12, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r14, 1.1694F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3054F, 0.0F);
        //this.body.offsetX = -0.09F;
        this.Arduafrons.offsetY = -0.13F;
        this.Arduafrons.offsetZ = -0.04F;
        this.Arduafrons.offsetX = -0.06F;
        this.Arduafrons.render(0.01F);
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
        this.Arduafrons.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Arduafrons, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Arduafrons.rotateAngleZ = (float) Math.toRadians(90);
                this.Arduafrons.offsetY = 0.58F;
                this.bob(Arduafrons, -speed, 5F, false, f2, 1);
            }
        }
    }
}
