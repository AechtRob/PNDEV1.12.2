package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTurrisaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Turrisaspis;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer Plate_r1;
    private final AdvancedModelRenderer plate_r2;
    private final AdvancedModelRenderer plate_r3;
    private final AdvancedModelRenderer plate_r4;
    private final AdvancedModelRenderer plate_r5;
    private final AdvancedModelRenderer MedianDorsalPlate;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer skin_r1;
    private final AdvancedModelRenderer skin_r2;
    private final AdvancedModelRenderer Skin_r3;
    private final AdvancedModelRenderer Segment1;
    private final AdvancedModelRenderer Segment2;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer analR;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer Segment4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelTurrisaspis() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.Turrisaspis = new AdvancedModelRenderer(this);
        this.Turrisaspis.setRotationPoint(0.0F, 26.0F, -1.0F);


        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Turrisaspis.addChild(Body);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(1.0F, -7.0F, 3.0F);
        this.Body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 52, 31, -2.0F, -1.0F, -11.0F, 4, 3, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 40, 39, -2.5F, -2.0F, -9.0F, 5, 4, 4, 0.0F, false));

        this.Plate_r1 = new AdvancedModelRenderer(this);
        this.Plate_r1.setRotationPoint(-2.0F, 2.5F, -6.1F);
        this.Cephalon.addChild(Plate_r1);
        this.setRotateAngle(Plate_r1, -0.0873F, 0.0F, 0.0F);
        this.Plate_r1.cubeList.add(new ModelBox(Plate_r1, 0, 10, 3.5F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));
        this.Plate_r1.cubeList.add(new ModelBox(Plate_r1, 5, 10, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.plate_r2 = new AdvancedModelRenderer(this);
        this.plate_r2.setRotationPoint(-2.0F, 2.0F, -9.0F);
        this.Cephalon.addChild(plate_r2);
        this.setRotateAngle(plate_r2, -0.1745F, 0.0F, 0.0F);
        this.plate_r2.cubeList.add(new ModelBox(plate_r2, 0, 56, 3.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));
        this.plate_r2.cubeList.add(new ModelBox(plate_r2, 56, 37, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.plate_r3 = new AdvancedModelRenderer(this);
        this.plate_r3.setRotationPoint(0.0F, -3.0F, -9.0F);
        this.Cephalon.addChild(plate_r3);
        this.setRotateAngle(plate_r3, 0.2182F, 0.0F, 0.0F);
        this.plate_r3.cubeList.add(new ModelBox(plate_r3, 36, 48, -2.0F, 1.0F, -0.2F, 4, 2, 4, 0.0F, false));

        this.plate_r4 = new AdvancedModelRenderer(this);
        this.plate_r4.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.Cephalon.addChild(plate_r4);
        this.setRotateAngle(plate_r4, 0.8203F, 0.0F, 0.0F);
        this.plate_r4.cubeList.add(new ModelBox(plate_r4, 55, 25, -1.5F, -1.4F, 0.8F, 3, 2, 2, 0.0F, false));

        this.plate_r5 = new AdvancedModelRenderer(this);
        this.plate_r5.setRotationPoint(0.0F, 2.0F, -11.0F);
        this.Cephalon.addChild(plate_r5);
        this.setRotateAngle(plate_r5, 0.2793F, 0.0F, 0.0F);
        this.plate_r5.cubeList.add(new ModelBox(plate_r5, 0, 48, -2.0F, -3.0F, 0.0F, 4, 3, 4, -0.01F, false));

        this.MedianDorsalPlate = new AdvancedModelRenderer(this);
        this.MedianDorsalPlate.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Cephalon.addChild(MedianDorsalPlate);
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 0, 36, -2.5F, -2.9F, 0.0F, 5, 6, 5, 0.0F, false));
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 49, 51, -1.0F, -4.0F, 1.0F, 2, 2, 4, 0.0F, false));
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 37, 55, -0.5F, -10.7F, 2.8F, 1, 7, 2, 0.0F, false));
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 7, 0, -0.5F, -12.7F, 3.8F, 1, 2, 1, 0.0F, false));
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 32, 53, 0.0F, -14.0F, 4.0F, 0, 11, 2, 0.0F, false));
        this.MedianDorsalPlate.cubeList.add(new ModelBox(MedianDorsalPlate, 14, 0, -6.0F, 0.7F, 0.0F, 12, 2, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-6.0F, 2.7F, 2.0F);
        this.MedianDorsalPlate.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7156F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 0, 7.8F, -1.0F, -8.7F, 5, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.0F, 2.7F, 2.0F);
        this.MedianDorsalPlate.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7156F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 49, -3.8F, -1.0F, -0.7F, 5, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -12.7F, 4.8F);
        this.MedianDorsalPlate.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.3F, -1.0F, 1, 3, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -11.0F, 4.7F);
        this.MedianDorsalPlate.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 54, -0.5F, 0.6F, -1.9F, 1, 7, 2, -0.01F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 3.0F, 3.0F);
        this.MedianDorsalPlate.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -0.0897F, -0.3867F, -0.2322F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 34, 31, -4.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 3.0F, 3.0F);
        this.MedianDorsalPlate.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.0897F, 0.3867F, 0.2322F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 16, 30, -1.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.7F, -5.0F);
        this.Cephalon.addChild(Jaw);


        this.skin_r1 = new AdvancedModelRenderer(this);
        this.skin_r1.setRotationPoint(0.0F, -0.1F, -5.7F);
        this.Jaw.addChild(skin_r1);
        this.setRotateAngle(skin_r1, -0.3491F, 0.0F, 0.0F);
        this.skin_r1.cubeList.add(new ModelBox(skin_r1, 38, 19, -1.0F, -1.2F, -1.8F, 2, 1, 2, 0.0F, false));

        this.skin_r2 = new AdvancedModelRenderer(this);
        this.skin_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(skin_r2);
        this.setRotateAngle(skin_r2, -0.0524F, 0.0F, 0.0F);
        this.skin_r2.cubeList.add(new ModelBox(skin_r2, 27, 8, -2.0F, -1.6F, -4.0F, 4, 2, 4, 0.0F, false));

        this.Skin_r3 = new AdvancedModelRenderer(this);
        this.Skin_r3.setRotationPoint(0.0F, 0.3F, -3.9F);
        this.Jaw.addChild(Skin_r3);
        this.setRotateAngle(Skin_r3, -0.2443F, 0.0F, 0.0F);
        this.Skin_r3.cubeList.add(new ModelBox(Skin_r3, 14, 8, -1.5F, -2.1F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Segment1 = new AdvancedModelRenderer(this);
        this.Segment1.setRotationPoint(1.0F, -7.0F, 2.5F);
        this.Body.addChild(Segment1);
        this.Segment1.cubeList.add(new ModelBox(Segment1, 19, 15, -2.5F, -2.9F, 0.0F, 5, 6, 8, -0.01F, false));

        this.Segment2 = new AdvancedModelRenderer(this);
        this.Segment2.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Segment1.addChild(Segment2);
        this.Segment2.cubeList.add(new ModelBox(Segment2, 0, 23, -2.0F, -2.0F, 0.0F, 4, 5, 7, 0.0F, false));
        this.Segment2.cubeList.add(new ModelBox(Segment2, 0, 0, 0.0F, -5.0F, 1.0F, 0, 3, 6, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.0F, 3.0F, 4.0F);
        this.Segment2.addChild(AnalL);
        this.setRotateAngle(AnalL, -0.0596F, 0.3263F, 0.2285F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 46, 19, 0.0F, 0.0F, 0.0F, 4, 0, 5, 0.0F, false));

        this.analR = new AdvancedModelRenderer(this);
        this.analR.setRotationPoint(-1.0F, 3.0F, 4.0F);
        this.Segment2.addChild(analR);
        this.setRotateAngle(analR, -0.0448F, -0.3286F, -0.2745F);
        this.analR.cubeList.add(new ModelBox(analR, 41, 25, -4.0F, 0.0F, 0.0F, 4, 0, 5, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.Segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 21, 38, -1.5F, -2.3F, 0.0F, 3, 4, 6, 0.0F, false));

        this.Segment4 = new AdvancedModelRenderer(this);
        this.Segment4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.segment3.addChild(Segment4);
        this.Segment4.cubeList.add(new ModelBox(Segment4, 38, 8, -1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Segment4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -4.0F, 0.0F, 0, 9, 13, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 54, -0.5F, -0.6F, 0.6F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 5, -0.5F, -1.2F, 0.0F, 1, 2, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.14F);
    }
    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Segment1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Segment2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Segment4, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.Body.offsetY = 0.03F;
        this.Body.offsetX = -0.15F;
        this.Body.offsetZ = -0.55F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Segment1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Segment2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Segment4, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Body.offsetZ = -0.08F;
        this.Body.offsetX = -0.015F;
        this.Body.offsetY = 0.2F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body.offsetY = 1.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Segment1, this.Segment2, this.segment3, this.Segment4, this.tail};
        AdvancedModelRenderer[] fishfinL = {this.PectoralL};
        AdvancedModelRenderer[] fishfinR = {this.PectoralR};

        float speed = 0.3F;
        float taildegree = 0.22F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.09F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.33, f2, 1);
            this.chainSwing(fishfinL, speed, -0.15F, -3, f2, 1);
            this.chainWave(fishfinL, speed, 0.15F, -3, f2, 1);
            this.chainSwing(fishfinR, speed, 0.15F, -3, f2, 1);
            this.chainWave(fishfinR, speed, 0.15F, -3, f2, 1);
            this.swing(Body, speed, 0.22F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.5), (float)Math.toRadians(5), true, 0.20F, 0, f2, 1);
            this.walk(AnalL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(analR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(analR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = 1.4F;
                this.bob(Body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
