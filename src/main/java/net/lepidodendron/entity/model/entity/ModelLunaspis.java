package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelLunaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Lunaspis;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer VentralfinL;
    private final AdvancedModelRenderer VentralfinR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Cronualplateincline;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Cronualplateincline2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer PectoralfinR;

    public ModelLunaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Lunaspis = new AdvancedModelRenderer(this);
        this.Lunaspis.setRotationPoint(0.0F, 28.0F, -1.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Lunaspis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 23, -2.5F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 28, 5, -1.0F, -1.6F, 1.0F, 3, 1, 4, 0.0F, false));

        this.VentralfinL = new AdvancedModelRenderer(this);
        this.VentralfinL.setRotationPoint(-1.5F, 1.0F, 4.0F);
        this.Body1.addChild(VentralfinL);
        this.setRotateAngle(VentralfinL, -0.1309F, -0.5236F, 0.0F);
        this.VentralfinL.cubeList.add(new ModelBox(VentralfinL, 24, 28, -1.4F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.VentralfinR = new AdvancedModelRenderer(this);
        this.VentralfinR.setRotationPoint(0.5F, 1.0F, 4.0F);
        this.Body1.addChild(VentralfinR);
        this.setRotateAngle(VentralfinR, -0.1309F, 0.5236F, 0.0F);
        this.VentralfinR.cubeList.add(new ModelBox(VentralfinR, 18, 28, 0.3F, -0.1F, 1.0F, 3, 0, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 28, 10, -1.5F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 33, -0.5F, -1.6F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 28, 16, -1.0F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 32, -0.5F, -1.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 9, 35, -0.5F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, 0.0F, -1.3F, 0.0F, 1, 1, 2, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 18, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 22, 0.5F, -1.0F, 0.0F, 0, 3, 8, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Lunaspis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -2.5F, -1.0F, -8.0F, 6, 2, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 38, -1.0F, 0.0F, -9.6F, 3, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 10, -6.0F, 0.5F, -5.0F, 13, 1, 3, -0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 17, 23, -3.0F, -0.2F, -6.0F, 7, 1, 4, -0.02F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 0, -2.0F, -1.6F, -6.0F, 5, 1, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 16, 14, -2.0F, -1.6F, -2.0F, 5, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 35, 22, -1.5F, -1.6F, -1.0F, 4, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 10, 16, -2.5F, 0.5F, -8.0F, 6, 1, 6, -0.03F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.0F, 1.0F, -4.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.8988F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 30, -2.4855F, -0.2912F, -2.0F, 2, 1, 4, -0.03F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(5.0F, 1.0F, -4.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 3.1416F, 0.0F, -0.8988F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 28, -5.2855F, 6.4088F, -1.99F, 2, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0F, -7.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 37, -1.0F, -1.2F, -0.2F, 5, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -1.0F, -4.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 3.1416F, 0.0F, -0.6632F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 37, -3.8F, 2.0F, -2.0F, 1, 1, 4, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, -1.0F, -4.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6632F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 37, 0.4F, -1.1F, -2.0F, 1, 1, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 26, -1.0F, 0.2F, 0.4F, 3, 1, 2, -0.01F, false));

        this.Cronualplateincline = new AdvancedModelRenderer(this);
        this.Cronualplateincline.setRotationPoint(2.4F, 1.0F, -6.6F);
        this.Cephalon.addChild(Cronualplateincline);
        this.setRotateAngle(Cronualplateincline, 0.0F, -0.5498F, 0.0F);
        this.Cronualplateincline.cubeList.add(new ModelBox(Cronualplateincline, 38, 16, 0.7F, -0.5F, -1.0F, 4, 1, 2, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.0F, 0.0F, 1.0F);
        this.Cronualplateincline.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, 1.5F, -0.5F, -2.4F, 2, 1, 1, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Cronualplateincline.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3142F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 40, 1.4F, -0.5F, -1.5F, 3, 1, 2, -0.02F, false));

        this.Cronualplateincline2 = new AdvancedModelRenderer(this);
        this.Cronualplateincline2.setRotationPoint(2.4F, 1.0F, -6.6F);
        this.Cephalon.addChild(Cronualplateincline2);
        this.setRotateAngle(Cronualplateincline2, 3.1416F, -0.5498F, -3.1416F);
        this.Cronualplateincline2.cubeList.add(new ModelBox(Cronualplateincline2, 38, 5, 4.0F, -0.5F, 1.0F, 4, 1, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(5.0F, 0.0F, 1.0F);
        this.Cronualplateincline2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 3.1416F, -0.6109F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, -6.2F, -0.5F, -4.2F, 2, 1, 1, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Cronualplateincline2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 3.1416F, -0.3142F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 29, -6.8F, -0.5F, -4.4F, 3, 1, 2, -0.02F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -7.6F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2531F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 32, 33, -1.0F, -0.5698F, -1.5976F, 3, 1, 3, -0.01F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(1.5F, 1.0F, -3.0F);
        this.Cephalon.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, -0.1571F, 0.5411F, 0.0F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 14, -1.4F, -0.2F, 1.4F, 4, 0, 8, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-2.6F, 1.0F, -1.9F);
        this.Cephalon.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, 0.1571F, 0.5411F, -3.1416F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 12, 0, -2.4F, -0.1F, -0.5F, 4, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Lunaspis.render(f5 * 0.3F);
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
        this.Lunaspis.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Tail};

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
            this.swing(Lunaspis, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(PectoralfinL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(PectoralfinL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(PectoralfinR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(PectoralfinR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(VentralfinL, (float) (speed * 0.75), 0.08F, true, 2, 0, f2, 1);
            this.swing(VentralfinL, (float) (speed * 0.75), 0.08F, true, 2, 0, f2, 1);
            this.walk(VentralfinR, (float) (speed * 0.75), 0.08F, true, 2, 0, f2, 1);
            this.swing(VentralfinR, (float) (speed * 0.75), 0.08F, true, 2, 0, f2, 1);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Lunaspis.offsetY = 1.05F;
                this.bob(Lunaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
