package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPlatycaraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer platycaraspis;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer HEadinclination;
    private final AdvancedModelRenderer Bodystatic;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Tail;

    public ModelPlatycaraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.platycaraspis = new AdvancedModelRenderer(this);
        this.platycaraspis.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.platycaraspis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -6.0F, 0.0F, -14.0F, 12, 1, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 16, 41, -4.0F, 0.0F, -16.0F, 8, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 32, 0, -9.0F, 0.0F, -12.0F, 3, 1, 7, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 44, 27, 9.0F, 0.0F, -10.0F, 3, 1, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 16, 44, -12.0F, 0.0F, -10.0F, 3, 1, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 3, -14.0F, 0.0F, -8.0F, 2, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, 12.0F, 0.0F, -8.0F, 2, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 9, 29, 6.0F, 0.0F, -12.0F, 3, 1, 7, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 19, -4.0F, -1.0F, -14.0F, 8, 1, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 46, 21, -6.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 22, 28, 4.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 24, 22, -17.6F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 24, 19, 16.8F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 25, 27, -3.0F, -1.6F, -13.0F, 6, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -17.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 22, -0.7F, -1.0F, -0.7F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-14.0F, 1.0F, -6.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1416F, 1.5533F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 0, -0.5F, -1.0F, 27.8F, 3, 1, 3, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 17, 0.0F, -1.0F, -2.6F, 3, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -17.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -17.6F, -1.0F, -2.1365F, 14, 1, 4, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.0F, 1.0F, -16.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0008F, 0.2444F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 44, -0.1784F, -1.0F, -0.847F, 4, 1, 4, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -17.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -3.1416F, 0.5672F, 3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -17.5F, -1.0F, -1.9365F, 14, 1, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.0F, 1.0F, -16.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.1416F, 0.2182F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 8, 0.1216F, -1.0F, -3.1259F, 4, 1, 4, -0.02F, false));

        this.HEadinclination = new AdvancedModelRenderer(this);
        this.HEadinclination.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.Cephalon.addChild(HEadinclination);
        this.setRotateAngle(HEadinclination, -1.0908F, 0.0F, 0.0F);
        this.HEadinclination.cubeList.add(new ModelBox(HEadinclination, 10, 37, -3.0F, -0.5F, -0.9F, 6, 2, 1, 0.0F, false));

        this.Bodystatic = new AdvancedModelRenderer(this);
        this.Bodystatic.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Cephalon.addChild(Bodystatic);
        this.Bodystatic.cubeList.add(new ModelBox(Bodystatic, 24, 19, -4.0F, -2.0F, 0.0F, 8, 2, 6, 0.0F, false));
        this.Bodystatic.cubeList.add(new ModelBox(Bodystatic, 0, 37, -1.0F, -2.5F, 0.0F, 2, 1, 6, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.platycaraspis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 26, 35, -3.1F, -1.0F, 0.0F, 6, 2, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 41, 44, -1.0F, -1.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 40, 35, -0.5F, -1.3F, 0.0F, 1, 1, 6, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 32, 9, -1.6F, -1.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 19, -0.5F, -1.2F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 31, 41, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body3.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 20, 0.0F, -3.0F, -2.0F, 0, 7, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.platycaraspis.render(f5 * 0.22F);
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
        this.platycaraspis.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body1, this.Body2, this.Body3, this.Tail};

        float speed = 0.4F;
        float taildegree = 0.35F;

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
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(platycaraspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.platycaraspis.offsetY = 1.15F;
                this.bob(platycaraspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
