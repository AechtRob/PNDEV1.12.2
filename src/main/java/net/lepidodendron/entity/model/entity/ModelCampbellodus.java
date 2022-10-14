package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCampbellodus extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Firstdorsalfin;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Back1;
    public AdvancedModelRenderer Belly1;
    public AdvancedModelRenderer Tailmiddlebase;
    public AdvancedModelRenderer Back2;
    public AdvancedModelRenderer Belly2;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Back3;
    public AdvancedModelRenderer Belly3;
    public AdvancedModelRenderer Tailmiddleend;
    public AdvancedModelRenderer Tailfinback;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfinmiddle;
    public AdvancedModelRenderer Tailfinend;
    public AdvancedModelRenderer Seconddorsalfin;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Headfront;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Headspikebase;
    public AdvancedModelRenderer Headspikeend;

    public ModelCampbellodus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Firstdorsalfin = new AdvancedModelRenderer(this, 21, 6);
        this.Firstdorsalfin.setRotationPoint(0.0F, -1.5F, -4.599999904632568F);
        this.Firstdorsalfin.addBox(0.0F, -9.0F, 0.0F, 0, 9, 9, 0.0F);
        this.setRotateAngle(Firstdorsalfin, -0.2546435405291338F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 29, 84);
        this.Head.setRotationPoint(0.0F, 0.800000011920929F, -5.0F);
        this.Head.addBox(-3.5F, -1.5F, -6.0F, 7, 10, 6, 0.0F);
        this.setRotateAngle(Head, -0.04241150198859518F, 0.0F, 0.0F);
        this.Back2 = new AdvancedModelRenderer(this, 64, 61);
        this.Back2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Back2.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotateAngle(Back2, -0.21223203437934937F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRenderer(this, 0, 38);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.699999988079071F, 6.0F);
        this.Tailmiddlebase.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 8, 0.0F);
        this.Back3 = new AdvancedModelRenderer(this, 63, 51);
        this.Back3.setRotationPoint(0.0F, -2.200000047683716F, 0.0F);
        this.Back3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.setRotateAngle(Back3, -0.1485275233394591F, 0.0F, 0.0F);
        this.Tailfinmiddle = new AdvancedModelRenderer(this, 23, 21);
        this.Tailfinmiddle.setRotationPoint(-0.009999999776482582F, -1.0F, 0.0F);
        this.Tailfinmiddle.addBox(0.0F, -4.0F, 0.0F, 0, 4, 9, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 50);
        this.Tailbase.setRotationPoint(0.0F, 1.5F, 6.0F);
        this.Tailbase.addBox(-2.0F, -1.5F, 0.0F, 4, 6, 7, 0.0F);
        this.Seconddorsalfin = new AdvancedModelRenderer(this, 40, 9);
        this.Seconddorsalfin.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Seconddorsalfin.addBox(0.0F, -6.0F, 0.0F, 0, 6, 9, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 18, 64);
        this.Lowerjaw.setRotationPoint(0.0F, 7.400000095367432F, -5.5F);
        this.Lowerjaw.addBox(-2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.36093409463874954F, 0.0F, 0.0F);
        this.Belly2 = new AdvancedModelRenderer(this, 43, 63);
        this.Belly2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Belly2.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotateAngle(Belly2, 0.23352505591421208F, 0.0F, 0.0F);
        this.Headspikeend = new AdvancedModelRenderer(this, 50, 83);
        this.Headspikeend.setRotationPoint(0.0F, 0.30000001192092896F, 5.5F);
        this.Headspikeend.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Headspikeend, -0.12740903872453743F, 0.0F, 0.0F);
        this.Back1 = new AdvancedModelRenderer(this, 64, 71);
        this.Back1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Back1.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Back1, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRenderer(this, 0, 15);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.009999999776482582F, 7.400000095367432F);
        this.Tailmiddleend.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 9, 0.0F);
        this.setRotateAngle(Tailmiddleend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Headspikebase = new AdvancedModelRenderer(this, 57, 83);
        this.Headspikebase.setRotationPoint(0.0F, 0.0F, 4.400000095367432F);
        this.Headspikebase.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(Headspikebase, 0.6368706733475028F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 0, 27);
        this.Tailmiddle.setRotationPoint(0.0F, 0.5F, 7.199999809265137F);
        this.Tailmiddle.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.Headfront = new AdvancedModelRenderer(this, 25, 71);
        this.Headfront.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.Headfront.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 5, 0.0F);
        this.setRotateAngle(Headfront, -0.5731661290180989F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 56, 92);
        this.Headslope.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.Headslope.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Headslope, 0.31834805156902407F, 0.0F, 0.0F);
        this.Belly1 = new AdvancedModelRenderer(this, 48, 73);
        this.Belly1.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Belly1.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(Belly1, 0.21223203437934937F, 0.0F, 0.0F);
        this.Tailfinback = new AdvancedModelRenderer(this, 18, 30);
        this.Tailfinback.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.Tailfinback.addBox(0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F);
        this.Tailfinend = new AdvancedModelRenderer(this, 42, 17);
        this.Tailfinend.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.Tailfinend.addBox(0.0F, -3.0F, 0.0F, 0, 4, 13, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 18, 42);
        this.Leftpelvicfin.setRotationPoint(1.5F, 0.0F, 1.5F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F);
        this.setRotateAngle(Leftpelvicfin, -0.1485275233394591F, -0.46705011182842415F, 0.5094616179782085F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 18, 36);
        this.Rightpelvicfin.setRotationPoint(-2.0F, 0.0F, 1.5F);
        this.Rightpelvicfin.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F);
        this.setRotateAngle(Rightpelvicfin, -0.1485275233394591F, 0.42446406875869874F, -0.5094616179782085F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 64);
        this.Bodyend.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Bodyend.addBox(-2.5F, -1.5F, 0.0F, 5, 9, 7, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 16, 56);
        this.Leftpectoralfin.setRotationPoint(3.0F, 8.699999809265137F, -6.0F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, 0.0F, 9, 0, 7, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.169820528229565F, -0.42446406875869874F, 0.4457571069383183F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 81);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-3.0F, -1.5F, -6.0F, 6, 11, 8, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 16, 48);
        this.Rightpectoralfin.setRotationPoint(-3.0F, 8.699999809265137F, -6.0F);
        this.Rightpectoralfin.addBox(-9.0F, 0.0F, 0.0F, 9, 0, 7, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.169820528229565F, 0.42446406875869874F, -0.4457571069383183F);
        this.Belly3 = new AdvancedModelRenderer(this, 42, 52);
        this.Belly3.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Belly3.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(Belly3, 0.1911135497644277F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 3);
        this.Tailend.setRotationPoint(0.009999999776482582F, 0.0F, 8.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F);
        this.Bodyfront.addChild(this.Firstdorsalfin);
        this.Bodyfront.addChild(this.Head);
        this.Tailbase.addChild(this.Back2);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Tailmiddlebase.addChild(this.Back3);
        this.Tailmiddleend.addChild(this.Tailfinmiddle);
        this.Bodyend.addChild(this.Tailbase);
        this.Back2.addChild(this.Seconddorsalfin);
        this.Head.addChild(this.Lowerjaw);
        this.Tailbase.addChild(this.Belly2);
        this.Headspikebase.addChild(this.Headspikeend);
        this.Bodyend.addChild(this.Back1);
        this.Tailmiddle.addChild(this.Tailmiddleend);
        this.Headslope.addChild(this.Headspikebase);
        this.Tailmiddlebase.addChild(this.Tailmiddle);
        this.Head.addChild(this.Headfront);
        this.Head.addChild(this.Headslope);
        this.Bodyend.addChild(this.Belly1);
        this.Tailmiddle.addChild(this.Tailfinback);
        this.Tailend.addChild(this.Tailfinend);
        this.Belly1.addChild(this.Leftpelvicfin);
        this.Belly1.addChild(this.Rightpelvicfin);
        this.Bodyfront.addChild(this.Bodyend);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Tailmiddlebase.addChild(this.Belly3);
        this.Tailmiddleend.addChild(this.Tailend);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.175F);
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
        this.Bodyfront.offsetY = 1.3F;

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
                this.Bodyfront.offsetY = 1.5F;
                this.bob(Bodyfront, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
