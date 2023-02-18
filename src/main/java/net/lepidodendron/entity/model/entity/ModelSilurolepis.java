package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSilurolepis extends AdvancedModelBase {
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
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer fin2R;
    private final AdvancedModelRenderer fin2L;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer fin1R;
    private final AdvancedModelRenderer fin1L;

    public ModelSilurolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 0, -1.5F, -1.99F, -5.0F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 33, -2.85F, -2.0F, -4.6F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 32, 0.85F, -2.0F, -4.6F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 21, -1.5F, -3.15F, -5.325F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 37, -1.0F, -3.15F, -3.325F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 4, -1.0F, -3.0F, 4.0F, 2, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 28, -1.5F, -1.0F, -4.55F, 3, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -3.0F, -2.0F, 4, 3, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 36, -2.45F, -1.15F, -4.59F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 36, 1.45F, -1.15F, -4.59F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.6043F, -1.0F, -1.6572F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 10, -0.1204F, -1.5F, -0.2308F, 1, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.6043F, -1.0F, -1.6572F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 18, -0.8796F, -1.5F, -0.2308F, 1, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.4925F, -0.5F, -4.2106F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.319F, -0.7747F, -0.0939F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 33, -0.1528F, -0.7F, -0.1723F, 3, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.4925F, -0.5F, -4.2106F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.319F, 0.7747F, 0.0939F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 28, -2.8472F, -0.7F, -0.1723F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4495F, -2.6508F, -5.151F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4653F, 0.2998F, 0.3288F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 13, -0.5888F, -0.0242F, -1.0007F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4495F, -2.6508F, -5.151F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4653F, -0.2998F, -0.3288F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, -0.4112F, -0.0242F, -1.0007F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.9605F, -2.3441F, -3.4887F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0233F, 0.2608F, 0.3085F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 7, -0.8F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5355F, -2.6941F, -2.0637F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0099F, 0.0601F, 0.3064F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.9092F, -0.0269F, -0.3771F, 2, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5355F, -2.6941F, -2.0637F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0099F, -0.0601F, -0.3064F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -1.0908F, -0.0269F, -0.3771F, 2, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.9605F, -2.3441F, -3.4887F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0233F, -0.2608F, -0.3085F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 33, -1.2F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.1258F, -1.2162F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 2, -0.5F, 0.0F, -0.75F, 1, 1, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.0934F, -5.2228F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5323F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 37, -1.0F, -0.0285F, -2.0836F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.75F, 0.0F, -4.65F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.6545F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 11, -1.9456F, -2.05F, -2.9556F, 2, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.75F, 0.0F, -4.65F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6545F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 17, -0.0544F, -2.05F, -2.9556F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.01F, -2.0404F, -6.7381F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 36, -1.01F, -0.0255F, -1.2543F, 2, 1, 2, -0.01F, false));

        this.fin2R = new AdvancedModelRenderer(this);
        this.fin2R.setRotationPoint(-1.5F, -0.2F, 3.75F);
        this.head.addChild(fin2R);
        this.setRotateAngle(fin2R, 0.0F, 0.7854F, 0.0F);
        this.fin2R.cubeList.add(new ModelBox(fin2R, 12, 0, -3.0F, -0.04F, -0.5F, 3, 0, 2, 0.0F, false));

        this.fin2L = new AdvancedModelRenderer(this);
        this.fin2L.setRotationPoint(1.5F, -0.2F, 3.75F);
        this.head.addChild(fin2L);
        this.setRotateAngle(fin2L, 0.0F, -0.7854F, 0.0F);
        this.fin2L.cubeList.add(new ModelBox(fin2L, 12, 2, 0.0F, -0.04F, -0.5F, 3, 0, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.5F, 3.75F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 24, 22, -1.5F, -0.75F, 0.0F, 3, 2, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 29, 28, -1.0F, -1.25F, 0.0F, 1, 1, 4, 0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 36, 0, -0.5F, -1.45F, 1.0F, 1, 1, 3, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 30, 0, 0.0F, -1.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 23, 13, -1.0F, -0.71F, 0.0F, 2, 2, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 28, -0.5F, -1.05F, 0.0F, 1, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 9, 26, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.25F, -11.0F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 22, 0.0F, -8.25F, 11.5F, 0, 4, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.25F, -11.0F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, 0.15F, 13.8F, 0, 3, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 22, 0, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 20, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -0.4F, 0.0F, 0, 3, 10, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.0F, -4.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 38, -1.5F, -0.15F, -1.75F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 2, 36, -1.0F, -0.15F, -2.75F, 2, 1, 1, 0.0F, false));

        this.fin1R = new AdvancedModelRenderer(this);
        this.fin1R.setRotationPoint(-2.0F, -0.25F, -2.0F);
        this.head.addChild(fin1R);
        this.setRotateAngle(fin1R, 0.0F, 0.4363F, 0.0F);
        this.fin1R.cubeList.add(new ModelBox(fin1R, 19, 10, -5.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, false));

        this.fin1L = new AdvancedModelRenderer(this);
        this.fin1L.setRotationPoint(2.0F, -0.25F, -2.0F);
        this.head.addChild(fin1L);
        this.setRotateAngle(fin1L, 0.0F, -0.4363F, 0.0F);
        this.fin1L.cubeList.add(new ModelBox(fin1L, 5, 20, 0.0F, 0.0F, -0.5F, 5, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }
    public void renderStaticWall(float f) {
        this.head.rotateAngleX = (float) Math.toRadians(90);
        this.head.rotateAngleZ = (float) Math.toRadians(90);
        this.head.offsetX = -0.1F;
        this.head.offsetZ = 0.F;
        this.head.offsetY = -0.23F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(fin2R, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(fin2L, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(body1, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.7418F, 0.0F);
        this.setRotateAngle(fin1R, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(fin1L, 0.0F, -0.4363F, 0.0F);
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.06F;
        this.head.offsetZ = 0.F;
        this.head.offsetY = 0.1F;
        this.head.render(0.01F);
        resetToDefaultPose();
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
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(e.isInWater()) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, taildegree, -2.33, f2, 1);
            }
            this.swing(head, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), -0.3F, true, 0, -0.2F, f2, 1);
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
                this.chainSwing(fishTail, speed*0.5F, 0.2F, -3, f2, 1);
            }
        }
    }
}
