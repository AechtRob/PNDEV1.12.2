package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCongophiopsis extends AdvancedModelBase {
    private final AdvancedModelRenderer Congophiopsis;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralL2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PelvicL2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body5;

    public ModelCongophiopsis() {
        this.textureWidth = 53;
        this.textureHeight = 50;

        this.Congophiopsis = new AdvancedModelRenderer(this);
        this.Congophiopsis.setRotationPoint(0.0F, 24.0F, -3.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Congophiopsis.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 38, 21, -2.0F, -2.0F, -5.0F, 4, 5, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 34, 0, -1.5F, 2.725F, -4.975F, 3, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 19, 19, -3.0F, -2.0F, -3.0F, 6, 6, 3, -0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 34, 5, -1.5F, -3.0F, -4.0F, 3, 2, 4, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 0, -1.5F, -0.3F, -2.6F, 3, 4, 4, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.7F, -5.9F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3229F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 12, -2.0F, 1.3993F, 1.0185F, 4, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.3F, -4.7F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.9163F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 29, -1.0F, 0.0F, -4.0F, 2, 1, 5, -0.01F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -3.0F, -1.0F, 6, 7, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 2.7F, -0.4F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.7025F, 0.3419F, -0.2766F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 13, 37, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.PectoralL2 = new AdvancedModelRenderer(this);
        this.PectoralL2.setRotationPoint(-3.0F, 2.7F, -0.4F);
        this.Body1.addChild(PectoralL2);
        this.setRotateAngle(PectoralL2, -0.7025F, -0.3419F, 0.2766F);
        this.PectoralL2.cubeList.add(new ModelBox(PectoralL2, 13, 37, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 19, 9, -2.5F, -2.0F, -1.0F, 5, 5, 4, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1484F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 42, 0.0F, -3.0F, 0.0F, 0, 3, 4, 0.002F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 36, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2793F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 15, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.002F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.5F, 2.8F, 3.0F);
        this.Body2.addChild(PelvicL);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5131F, 0.3463F, -0.189F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -0.7F, 0.0F, 0, 1, 2, 0.0F, false));

        this.PelvicL2 = new AdvancedModelRenderer(this);
        this.PelvicL2.setRotationPoint(-1.5F, 2.8F, 3.0F);
        this.Body2.addChild(PelvicL2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5131F, -0.3463F, 0.189F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -0.7F, 0.0F, 0, 1, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 13, -2.0F, -2.0F, -1.0F, 4, 4, 5, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 38, -1.0F, -1.9F, 0.0F, 2, 2, 4, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 32, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.001F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 13, 29, -1.5F, -2.0F, -1.0F, 3, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.2F, -0.4F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 42, 0.0F, -0.0692F, -0.0583F, 0, 4, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.3F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3229F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 23, -0.5F, -1.35F, -0.4F, 1, 1, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 37, -1.0F, -1.0F, -1.0F, 2, 3, 4, -0.001F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 23, 0.0F, -3.0F, 2.0F, 0, 7, 6, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Congophiopsis.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Congophiopsis.rotateAngleY = (float) Math.toRadians(90);
        this.Congophiopsis.offsetZ = 0.03F;
        this.Congophiopsis.offsetY = -0.2F;
        this.Congophiopsis.offsetX = -0.06F;
        this.Congophiopsis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.1F, 0.0F, 0.1F);
        this.setRotateAngle(Body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3F, 0.0F);
        this.Congophiopsis.offsetY = -0.14F;
        this.Congophiopsis.render(0.01F);
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
        //this.Congophiopsis.offsetY = 0F;

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
            this.walk(PectoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(PelvicL2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicL2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);


            this.swing(Congophiopsis, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Congophiopsis.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 0.58F;
                this.bob(Congophiopsis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
