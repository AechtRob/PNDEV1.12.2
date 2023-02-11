package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMaterpiscis extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfinend;
    private final AdvancedModelRenderer Tailfinmiddle;
    private final AdvancedModelRenderer Tailfinback;
    private final AdvancedModelRenderer Back3;
    private final AdvancedModelRenderer Seconddorsalfin2;
    private final AdvancedModelRenderer Belly3;
    private final AdvancedModelRenderer Back2;
    private final AdvancedModelRenderer Seconddorsalfin1;
    private final AdvancedModelRenderer Belly2;
    private final AdvancedModelRenderer Back1;
    private final AdvancedModelRenderer Belly1;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Firstdorsalfin;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Headfront;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Dorsalfinsupport;
    private final AdvancedModelRenderer Leftpectoralfin;
    private final AdvancedModelRenderer Rightpectoralfin;

    public ModelMaterpiscis() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 80, -3.0F, -2.5F, -6.0F, 6, 12, 8, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Bodyfront.addChild(Bodyend);
        this.setRotateAngle(Bodyend, -0.1274F, 0.0F, 0.0F);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 0, 61, -2.5F, -2.0F, 0.0F, 5, 10, 8, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.5F, 7.0F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 47, -2.0F, -2.0F, 0.0F, 4, 7, 6, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.7F, 5.5F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0424F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 0, 35, -1.5F, -1.0F, 0.0F, 3, 3, 8, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.7F, 7.2F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.1485F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 0, 24, -1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.41F, 6.4F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0213F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 0, 12, -0.5F, -1.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.0F, 8.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 1, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.Tailfinend = new AdvancedModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.Tailend.addChild(Tailfinend);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 42, 17, 0.0F, -4.0F, 0.0F, 0, 5, 12, 0.0F, false));

        this.Tailfinmiddle = new AdvancedModelRenderer(this);
        this.Tailfinmiddle.setRotationPoint(0.01F, -1.0F, 0.0F);
        this.Tailmiddleend.addChild(Tailfinmiddle);
        this.Tailfinmiddle.cubeList.add(new ModelBox(Tailfinmiddle, 42, 26, 0.0F, -7.0F, 0.0F, 0, 7, 9, 0.0F, false));

        this.Tailfinback = new AdvancedModelRenderer(this);
        this.Tailfinback.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tailmiddle.addChild(Tailfinback);
        this.Tailfinback.cubeList.add(new ModelBox(Tailfinback, 19, 26, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.Back3 = new AdvancedModelRenderer(this);
        this.Back3.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.Tailmiddlebase.addChild(Back3);
        this.setRotateAngle(Back3, -0.2335F, 0.0F, 0.0F);
        this.Back3.cubeList.add(new ModelBox(Back3, 63, 51, -1.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Seconddorsalfin2 = new AdvancedModelRenderer(this);
        this.Seconddorsalfin2.setRotationPoint(-0.01F, 0.0F, -0.2F);
        this.Back3.addChild(Seconddorsalfin2);
        this.Seconddorsalfin2.cubeList.add(new ModelBox(Seconddorsalfin2, 51, 10, 0.0F, -3.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.Belly3 = new AdvancedModelRenderer(this);
        this.Belly3.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.Tailmiddlebase.addChild(Belly3);
        this.setRotateAngle(Belly3, 0.2759F, 0.0F, 0.0F);
        this.Belly3.cubeList.add(new ModelBox(Belly3, 42, 52, -1.0F, -2.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Back2 = new AdvancedModelRenderer(this);
        this.Back2.setRotationPoint(0.0F, -3.5F, 0.1F);
        this.Tailbase.addChild(Back2);
        this.setRotateAngle(Back2, -0.2335F, 0.0F, 0.0F);
        this.Back2.cubeList.add(new ModelBox(Back2, 65, 62, -1.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Seconddorsalfin1 = new AdvancedModelRenderer(this);
        this.Seconddorsalfin1.setRotationPoint(0.0F, 0.2F, 1.0F);
        this.Back2.addChild(Seconddorsalfin1);
        this.Seconddorsalfin1.cubeList.add(new ModelBox(Seconddorsalfin1, 40, 9, 0.0F, -5.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Belly2 = new AdvancedModelRenderer(this);
        this.Belly2.setRotationPoint(0.0F, 6.6F, 0.1F);
        this.Tailbase.addChild(Belly2);
        this.setRotateAngle(Belly2, 0.2546F, 0.0F, 0.0F);
        this.Belly2.cubeList.add(new ModelBox(Belly2, 47, 63, -1.5F, -2.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Back1 = new AdvancedModelRenderer(this);
        this.Back1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Bodyend.addChild(Back1);
        this.setRotateAngle(Back1, -0.0637F, 0.0F, 0.0F);
        this.Back1.cubeList.add(new ModelBox(Back1, 69, 71, -2.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F, false));

        this.Belly1 = new AdvancedModelRenderer(this);
        this.Belly1.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.Bodyend.addChild(Belly1);
        this.setRotateAngle(Belly1, 0.1698F, 0.0F, 0.0F);
        this.Belly1.cubeList.add(new ModelBox(Belly1, 52, 73, -2.0F, -2.0F, 0.0F, 4, 2, 8, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-1.7F, -0.5F, 7.0F);
        this.Belly1.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, -0.1485F, 0.1485F, -0.5095F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 19, 28, -6.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(1.7F, -0.5F, 7.0F);
        this.Belly1.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, -0.1485F, -0.1485F, 0.5095F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 19, 36, 0.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, false));

        this.Firstdorsalfin = new AdvancedModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.5F, -4.4F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.setRotateAngle(Firstdorsalfin, -0.2546F, 0.0F, 0.0F);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 40, 10, 0.0F, -8.0F, 0.0F, 0, 8, 10, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.8F, -5.0F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, 0.0424F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 29, 83, -3.5F, -2.5F, -6.0F, 7, 11, 6, 0.0F, false));

        this.Headfront = new AdvancedModelRenderer(this);
        this.Headfront.setRotationPoint(0.0F, -2.4F, -6.0F);
        this.Head.addChild(Headfront);
        this.setRotateAngle(Headfront, -0.7006F, 0.0F, 0.0F);
        this.Headfront.cubeList.add(new ModelBox(Headfront, 27, 70, -3.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(-0.01F, 6.0F, 0.0F);
        this.Headfront.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.7006F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 30, 0, -3.0F, 0.0F, 0.0F, 6, 4, 5, 0.0F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headfront.addChild(Snout);
        this.setRotateAngle(Snout, 1.2736F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 13, 4, -2.0F, 0.0F, -8.0F, 4, 5, 8, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 7.3F, -5.2F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.1274F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 23, 61, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -2.5F, -6.0F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.3183F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 56, 92, -2.5F, 0.0F, 0.0F, 5, 2, 6, 0.0F, false));

        this.Dorsalfinsupport = new AdvancedModelRenderer(this);
        this.Dorsalfinsupport.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.Headslope.addChild(Dorsalfinsupport);
        this.setRotateAngle(Dorsalfinsupport, 0.2335F, 0.0F, 0.0F);
        this.Dorsalfinsupport.cubeList.add(new ModelBox(Dorsalfinsupport, 73, 83, -1.5F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(-3.0F, 8.7F, -6.0F);
        this.Bodyfront.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, 0.1698F, 0.4245F, -0.4458F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 19, 44, -11.0F, 0.0F, 0.0F, 11, 0, 7, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(3.0F, 8.7F, -6.0F);
        this.Bodyfront.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, 0.1698F, -0.4245F, 0.4458F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 19, 52, 0.0F, 0.0F, 0.0F, 11, 0, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Bodyfront.offsetY = 0.45F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailmiddlebase, this.Tailmiddle, this.Tailend};

        float speed = 0.4F;
        float taildegree = 0.25F;

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
            speed = 0.095F;
            taildegree = 0.11F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -1.5, f2, 0.8F);
            this.chainSwing(fishTail, speed, taildegree, -1, f2, 0.8F);
            this.swing(Bodyfront, speed, 0.25F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.85F;
                this.bob(Bodyfront, speed, 0.2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            }
        }
    }
}
