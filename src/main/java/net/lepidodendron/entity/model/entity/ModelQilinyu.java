package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelQilinyu extends AdvancedModelBase {
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
    private final AdvancedModelRenderer fin2R;
    private final AdvancedModelRenderer fin2L;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer fin1R;
    private final AdvancedModelRenderer fin1L;

    public ModelQilinyu() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 4, -1.5F, -1.99F, -5.0F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 28, -2.85F, -2.0F, -4.6F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 21, 0.85F, -2.0F, -4.6F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 11, -1.5F, -3.15F, -5.2F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 21, -1.0F, -3.15F, -3.2F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 18, -0.99F, -3.1F, 3.0F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 24, -1.5F, -1.0F, -4.25F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -1.2F, -2.0F, 4, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -2.35F, -2.0F, 4, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 0, -2.45F, -1.15F, -4.59F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 29, 1.45F, -1.15F, -4.59F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 1.65F, -1.5F, -2.0F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -2.65F, -1.5F, -2.0F, 1, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, -0.95F, -0.5F, -5.0F, 3, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 29, -5.15F, -2.05F, -4.75F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 24, -2.05F, -0.5F, -5.0F, 3, 0, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 25, 3.15F, -2.05F, -4.75F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2618F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -2.35F, -2.85F, -4.75F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 8, -1.5F, -3.05F, -1.85F, 3, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -1.0F, -5.75F, -4.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 32, -0.99F, -1.77F, -7.55F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2618F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 7, 0.35F, -2.85F, -4.75F, 2, 1, 3, 0.0F, false));

        this.fin2R = new AdvancedModelRenderer(this);
        this.fin2R.setRotationPoint(-1.5F, -0.2F, 3.75F);
        this.head.addChild(fin2R);
        this.setRotateAngle(fin2R, 0.0F, 0.7854F, 0.0F);
        this.fin2R.cubeList.add(new ModelBox(fin2R, 6, 15, -3.0F, -0.04F, -0.5F, 3, 0, 2, 0.0F, false));

        this.fin2L = new AdvancedModelRenderer(this);
        this.fin2L.setRotationPoint(1.5F, -0.2F, 3.75F);
        this.head.addChild(fin2L);
        this.setRotateAngle(fin2L, 0.0F, -0.7854F, 0.0F);
        this.fin2L.cubeList.add(new ModelBox(fin2L, 6, 17, 0.0F, -0.04F, -0.5F, 3, 0, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.5F, 3.75F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 14, 0, -1.5F, -0.75F, 0.0F, 3, 2, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 35, -0.98F, -1.25F, 0.0F, 1, 1, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 35, -0.5F, -1.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 35, 0.0F, -1.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 15, -1.0F, -0.71F, 0.0F, 2, 2, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 12, 23, -0.5F, -1.05F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 21, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.25F, -12.0F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -7.25F, 11.5F, 0, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.25F, -12.0F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, 0.0F, 0.5F, 13.25F, 0, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 2, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 8, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 16, 0.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -0.5F, 5.75F, 0, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.0F, -4.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 14, -1.0F, -0.15F, -2.0F, 2, 1, 2, 0.0F, false));

        this.fin1R = new AdvancedModelRenderer(this);
        this.fin1R.setRotationPoint(-2.0F, -0.25F, -2.0F);
        this.head.addChild(fin1R);
        this.setRotateAngle(fin1R, 0.0F, 0.4363F, 0.0F);
        this.fin1R.cubeList.add(new ModelBox(fin1R, 15, 8, -5.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, false));

        this.fin1L = new AdvancedModelRenderer(this);
        this.fin1L.setRotationPoint(2.0F, -0.25F, -2.0F);
        this.head.addChild(fin1L);
        this.setRotateAngle(fin1L, 0.0F, -0.4363F, 0.0F);
        this.fin1L.cubeList.add(new ModelBox(fin1L, 15, 11, 0.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.29F);
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
        this.head.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

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
            this.swing(head, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), -0.3F, true, 0, 0, f2, 1);
            this.flap(fin1L, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(fin1L, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(fin1R, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(fin1R, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);

            this.flap(fin2L, (float) (speed * 0.75), 0.09F, true, 0, 0, f2, 1);
            this.swing(fin2L, (float) (speed * 0.75), 0.09F, true, 0, 0, f2, 1);
            this.flap(fin2R, (float) (speed * 0.75), -0.09F, true, 0, 0, f2, 1);
            this.swing(fin2R, (float) (speed * 0.75), 0.09F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 1.0F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
